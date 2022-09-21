package com.project.enlist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.enlist.entity.JobDetailsDomain;
import com.project.enlist.repository.JobDetailsRepo;

@Service
public class JobDetailsService {
	@Autowired
	private JobDetailsRepo repo;
	
	public List<JobDetailsDomain> listAll()
	{
		return repo.findAll();
	}
	
	public void save(JobDetailsDomain jobdetails) {
		repo.save(jobdetails);
	}
	
	public JobDetailsDomain get(long jobid)
	{
		return repo.findById(jobid).get();
	}
	
	public void delete(long jobid)
	{
		repo.deleteById(jobid);
	}
}
