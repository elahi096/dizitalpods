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

import com.project.enlist.entity.CandidateDetailsDomain;
import com.project.enlist.service.CandidateDetailsService;

@RestController
public class CandidateDetailsController {
@Autowired
private CandidateDetailsService service;

@GetMapping("/candidate")
public List<CandidateDetailsDomain> listAll()
{
	return service.listAll();
}

@GetMapping("/candidate/{cno}")
public CandidateDetailsDomain getTask (@PathVariable long cno)
{
	return service.get(cno);
}

@PostMapping("/candidate")
public void addDetails(@RequestBody CandidateDetailsDomain cd)
{
	service.save(cd);
}

@PutMapping(value="/candidate/{cno}")
public ResponseEntity<?> editCandidateDetails(@RequestBody CandidateDetailsDomain newCandidateDetails, @PathVariable long cno)
{
	try
	{
		CandidateDetailsDomain existingCandidateDetails=service.get(cno);
		existingCandidateDetails.setFname(newCandidateDetails.getFname());
		existingCandidateDetails.setLname(newCandidateDetails.getLname());
		existingCandidateDetails.setPno(newCandidateDetails.getPno());
		existingCandidateDetails.setAlternatepno(newCandidateDetails.getAlternatepno());
		existingCandidateDetails.setEmail(newCandidateDetails.getEmail());
		existingCandidateDetails.setDepartment(newCandidateDetails.getDepartment());
		existingCandidateDetails.setRolename(newCandidateDetails.getRolename());
		existingCandidateDetails.setClientname(newCandidateDetails.getClientname());
		existingCandidateDetails.setTechskills(newCandidateDetails.getTechskills());
		existingCandidateDetails.setOtherskills(newCandidateDetails.getOtherskills());
		existingCandidateDetails.setTotalexp(newCandidateDetails.getTotalexp());
		existingCandidateDetails.setPrevorgs(newCandidateDetails.getPrevorgs());
		existingCandidateDetails.setSummary(newCandidateDetails.getSummary());
		existingCandidateDetails.setNaukariid(newCandidateDetails.getNaukariid());
		existingCandidateDetails.setLinkedinid(newCandidateDetails.getLinkedinid());
		existingCandidateDetails.setSource(newCandidateDetails.getSource());
		existingCandidateDetails.setCreatedon(newCandidateDetails.getCreatedon());
		existingCandidateDetails.setCreatedby(newCandidateDetails.getCreatedby());
		existingCandidateDetails.setUpdatedon(newCandidateDetails.getUpdatedon());
		existingCandidateDetails.setUpdatedby(newCandidateDetails.getUpdatedby());
		existingCandidateDetails.setLockedstatus(newCandidateDetails.getLockedstatus());
		service.save(existingCandidateDetails);
		return new ResponseEntity<>(HttpStatus.OK);
	} 
	catch (Exception e) 
	{
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	}

@DeleteMapping("/candidate/{cno}")
public void delete(@PathVariable long cno) 
{
	service.delete(cno);
}
}
