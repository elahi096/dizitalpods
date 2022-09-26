package com.project.enlist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("/index")
	public String displayJobDetails()
	{
		return "index.html";
	}
	
	@RequestMapping("/overview")
	public String overview()
	{
		return "overview";
	}
	
	@RequestMapping("/calendar")
	public String calenderDetails()
	{
		return "calendar";
	}
	
	@RequestMapping("/Inbox")
	public String inboxMessages()
	{
		return "Inbox";
	}
	
	@RequestMapping("/CandidateInputScreen")
	public String inputCandidateDetails()
	{
		return "CandidateInputScreen";
	}
	
	@RequestMapping("/CandidateDisplayScreen")
	public String displayCandidateDetails()
	{
		return "CandidateDisplayScreen";
	}
	
	@RequestMapping("/candidateProfile")
	public String displayCandidateProfile()
	{
		return "candidateProfile";
	}
	
	@RequestMapping("/JobInputScreen")
	public String inputJobDetails()
	{
		return "JobInputScreen";
	}
	
	@RequestMapping("/jobdescription")
	public String jobDescription()
	{
		return "jobdescription";
	}
	
	@RequestMapping("/Jobposting")
	public String jobPosting()
	{
		return "Jobposting";
	}
	
	@RequestMapping("/statuspage")
	public String statuspage()
	{
		return "statuspage";
	}
	
	@RequestMapping("/ReferralScreen")
	public String displayReferralDetails()
	{
		return "ReferralScreen";
	}
	
	@RequestMapping("/ClientScreen")
	   public String displayClient()
	   {
		   return "ClientScreen";
	  }
	
	@RequestMapping("/EmployeeScreen")
	public String displayEmployee()
	{
		return "EmployeeScreen";
	}
	
	@RequestMapping("/RoleScreen")
	public String displayRole()
	{
		return "RoleScreen";
	}
	@RequestMapping("/candidateP")
	public String cP()
	{
		return "candidateProfile";
	}
}