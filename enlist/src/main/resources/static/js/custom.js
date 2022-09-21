(function($) {
    "use strict"; // Start of use strict
    //tab click
    $("#job-tab a, #job-status-tab a").click(function(e) {
        e.preventDefault();
        $(this).tab("show");
        multiplyNode();
    });

    function Reset() {
        document.getElementById("form1").reset();
    }
    // Please do not use inline event handlers, use this instead:
    // document.getElementById("resetBtn").onclick = function() {
    //     Reset();
    // }

    // Left side bar Active action Start


    // var header = document.getElementById("accordionSidebar");
    // var btns = header.getElementsByClassName("nav-item");
    // for (var i = 0; i < nav-item.length; i++) {
    //     nav-item[i].addEventListener("click", function() {
    //         var current = document.getElementsByClassName("active");
    //         current[0].className = current[0].className.replace(" active", "");
    //         this.className += " active";
    //     });
    // }


    // $('.nav-item').on('click', function() {
    //     $(this).addClass('active').siblings('li').removeClass('active');
    //   });

    // Left side bar Active action  End


    // Toggle the side navigation
    $("#sidebarToggle, #sidebarToggleTop").on('click', function(e) {
        $("body").toggleClass("sidebar-toggled");
        $(".sidebar").toggleClass("toggled");
        if ($(".sidebar").hasClass("toggled")) {
            $('.sidebar .collapse').collapse('hide');
        };
    });

    // Close any open menu accordions when window is resized below 768px
    $(window).resize(function() {
        if ($(window).width() < 768) {
            $('.sidebar .collapse').collapse('hide');
        };

        // Toggle the side navigation when window is resized below 480px
        if ($(window).width() < 480 && !$(".sidebar").hasClass("toggled")) {
            $("body").addClass("sidebar-toggled");
            $(".sidebar").addClass("toggled");
            $('.sidebar .collapse').collapse('hide');
        };
    });

    // Prevent the content wrapper from scrolling when the fixed side navigation hovered over
    $('body.fixed-nav .sidebar').on('mousewheel DOMMouseScroll wheel', function(e) {
        if ($(window).width() > 768) {
            var e0 = e.originalEvent,
                delta = e0.wheelDelta || -e0.detail;
            this.scrollTop += (delta < 0 ? 1 : -1) * 30;
            e.preventDefault();
        }
    });

    // Scroll to top button appear
    $(document).on('scroll', function() {
        var scrollDistance = $(this).scrollTop();
        if (scrollDistance > 100) {
            $('.scroll-to-top').fadeIn();
        } else {
            $('.scroll-to-top').fadeOut();
        }
    });

    // Smooth scrolling using jQuery easing
    $(document).on('click', 'a.scroll-to-top', function(e) {
        var $anchor = $(this);
        $('html, body').stop().animate({
            scrollTop: ($($anchor.attr('href')).offset().top)
        }, 1000, 'easeInOutExpo');
        e.preventDefault();
    });

    $(function() {
        $('#datepicker').datepicker();
    });


    const dates = [`<input type='date' />  <span>clear</span>`];

    function render() {
        for (let i = 0; i < dates.length; i++) {
            $("#add-date").append(dates[i])
        }
    }
    render()

    if (document.getElementById("addsection")) {
        document.getElementById("addsection").onclick = function() {
            // var container = document.getElementById("add-date");
            // var section = document.getElementById("datepicker");
            // container.appendChild(section.cloneNode(true));
            $("#add-date").empty()
            dates.push(`<input type='date' />  <span>clear</span>`)

            render()
        }

    }
    // $('.datepicker').datepicker({
    //     labelMonthNext: 'Go to the next month',
    //     labelMonthPrev: 'Go to the previous month',
    //     labelMonthSelect: 'Pick a month from the dropdown',
    //     labelYearSelect: 'Pick a year from the dropdown',
    //     selectMonths: true,
    //     selectYears: true
    // })

    const input = document.querySelector("input[type=file]")
    console.log(input)
    if (input) {
        input.onchange = function(e) {

            var file = e.target.files[0]
            var filename = file.name
            var extension = file.type

            var blob = new Blob([file], { type: extension })

            console.log(blob)

            var a = document.createElement("a")
            a.href = URL.createObjectURL(blob)
            a.download = filename
            a.click();



        }
    }

    $(document).ready(function($) {
        $(".clickable-row").click(function() {
            window.location = $(this).data("href");
        });
    });

    // Candidate profile page edit button functionality start

    const editBtn = document.getElementById("candidate_profile_edit")
    const checkBtn = document.getElementById("candidate_profile_check")
    checkBtn.style.display = "none"
    const tableDropdownEls = document.querySelectorAll('#hr-interview-status');
    const tableTexts = document.querySelectorAll("#hr-interview-status-text");
    const hrInterviewBlock = document.getElementById("hr-interview-block");
    const backdrop = document.getElementById("backdrop");

    tableDropdownEls.forEach((el, index) => {
        tableTexts[index].innerHTML = el.value
    })


    editBtn.addEventListener('click', function() {
        backdrop.style.zIndex = "1"
        tableDropdownEls.forEach((el, index) => {
            el.style.display = "block";
            tableTexts[index].innerHTML = el.value;
        })
        tableTexts.forEach(el => {
            el.style.display = "none";
        })
        checkBtn.style.display = "block"
        editBtn.style.display = "none"
        hrInterviewBlock.style.zIndex = "1"
    })

    checkBtn.addEventListener('click', function() {
        backdrop.style.zIndex = "0"
        tableDropdownEls.forEach((el, index) => {
            el.style.display = "none";
            tableTexts[index].innerHTML = el.value
        })
        tableTexts.forEach(el => {
            el.style.display = "block";
        })
        editBtn.style.display = "block"
        checkBtn.style.display = "none"
        hrInterviewBlock.style.zIndex = "0"
    })

    // candidate profile page edit button functionality end 



})(jQuery); // End of use strict