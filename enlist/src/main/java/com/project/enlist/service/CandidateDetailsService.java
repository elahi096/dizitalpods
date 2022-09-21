package com.project.enlist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.enlist.entity.CandidateDetailsDomain;
import com.project.enlist.repository.CandidateDetailsRepo;

@Service
public class CandidateDetailsService {
@Autowired
private CandidateDetailsRepo repo;

public List<CandidateDetailsDomain> listAll()
{
	return repo.findAll();
}
public void save(CandidateDetailsDomain candidatedetails) {
	repo.save(candidatedetails);
}

public CandidateDetailsDomain get(long cno) {
	return repo.findById(cno).get();
}
public void delete(long cno)
{
	repo.deleteById(cno);
}
}
