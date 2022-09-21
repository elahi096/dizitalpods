package com.project.enlist.controller;

import java.util.List;		

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.enlist.entity.InterviewSchedule;
import com.project.enlist.service.InterviewScheduleService;

@RestController
public class InterviewScheduleController 
{
	@Autowired
	private InterviewScheduleService serv;
	
	@GetMapping("/cal/interviewschedule")
	public List<InterviewSchedule> findAll(){
		return serv.fetch();
	}
	
	@GetMapping("cal/interviewschedule/{date}")
	public List<InterviewSchedule> getDetails(@PathVariable String date)
	{
		return serv.findByDate(date);
	}
	
	@PostMapping("cal/interviewschedule")
	public void schedule(@RequestBody InterviewSchedule is) {
		serv.save(is);
	}
	
	@PutMapping("cal/interviewschedule/")
	public ResponseEntity<?> updateInterviewSchedule(@RequestBody InterviewSchedule newDetails, @PathVariable int scheduleId)
	{
		try {
			InterviewSchedule existingDetails = serv.findWithId(scheduleId);
			existingDetails.setTask(newDetails.getTask());
			existingDetails.setCategory(newDetails.getCategory());
			existingDetails.setAssignnedTo(newDetails.getAssignnedTo());
			existingDetails.setDate(newDetails.getDate());
			existingDetails.setTime(newDetails.getTime());
			serv.save(existingDetails);
			return new ResponseEntity<>(HttpStatus.OK);
			}
		catch (Exception e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/cal/interviewschedule/{scheduleId}")
	public void delete(@PathVariable int scheduleId) 
	{
		serv.delete(scheduleId);
	}
	
}
