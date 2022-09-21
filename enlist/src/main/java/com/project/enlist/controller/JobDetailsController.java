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

import com.project.enlist.entity.JobDetailsDomain;
import com.project.enlist.service.JobDetailsService;

@RestController
public class JobDetailsController {
	@Autowired
	private JobDetailsService service;
	
	@GetMapping("/job")
	public List<JobDetailsDomain> listAll()
	{
		return service.listAll();
	}
	
	@GetMapping("/job/{jobid}")
	public JobDetailsDomain getTask(@PathVariable int jobid)
	{
		return service.get(jobid);
	}
	
	@PostMapping("/job")
	public void addDetails(@RequestBody JobDetailsDomain jd)
	{
		
		service.save(jd);
	}
	
	@PutMapping(value="/job/{jobid}")
	public ResponseEntity<?> editJobDetails (@RequestBody JobDetailsDomain newJobDetails, @PathVariable long jobid)
	{
		try
		{
			JobDetailsDomain existingJobDetails=service.get(jobid);
			existingJobDetails.setJobtitle(newJobDetails.getJobtitle());
			existingJobDetails.setDomain(newJobDetails.getDomain());
			existingJobDetails.setRolename(newJobDetails.getRolename());
			existingJobDetails.setClientname(newJobDetails.getClientname());
			existingJobDetails.setTechskills(newJobDetails.getTechskills());
			existingJobDetails.setExprange(newJobDetails.getExprange());
			existingJobDetails.setJobtype(newJobDetails.getJobtype());
			existingJobDetails.setJobdesc(newJobDetails.getJobdesc());
			existingJobDetails.setSalaryrange(newJobDetails.getSalaryrange());
			existingJobDetails.setOpenpositions(newJobDetails.getOpenpositions());
			existingJobDetails.setJobresponsibilities(newJobDetails.getJobresponsibilities());
			existingJobDetails.setBenefits(newJobDetails.getBenefits());
			existingJobDetails.setJoinedby(newJobDetails.getJoinedby());
			existingJobDetails.setCreatedby(newJobDetails.getCreatedby());
			existingJobDetails.setCreatedon(newJobDetails.getCreatedon());
			existingJobDetails.setAssignedon(newJobDetails.getAssignedon());
			existingJobDetails.setAssignedby(newJobDetails.getAssignedby());
			service.save(existingJobDetails);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping(value="/job/{jobid}")
	public void delete (@PathVariable long jobid)
	{
		service.delete(jobid);
		}
}
