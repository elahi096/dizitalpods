package com.project.enlist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.enlist.entity.CandidateDisp;
import com.project.enlist.repository.CandidateDispRepo;
@Service
public class CandidateDispService 
{
	@Autowired
	CandidateDispRepo repo;
	
	
	public List<CandidateDisp> fetch(){
		return repo.findAll();
	}
}
