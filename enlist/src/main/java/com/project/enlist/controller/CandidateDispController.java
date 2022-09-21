package com.project.enlist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.project.enlist.entity.CandidateDisp;
import com.project.enlist.service.CandidateDispService;

@RestController
public class CandidateDispController {
	@Autowired
	public CandidateDispService cds;
	
	
	@GetMapping("/dispcan")
	public List<CandidateDisp> listAll()
	{
		return cds.fetch();
	}
}
