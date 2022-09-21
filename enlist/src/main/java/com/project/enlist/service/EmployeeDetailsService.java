package com.project.enlist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.enlist.entity.EmployeeDetailsDomain;
import com.project.enlist.repository.EmployeeDetailsRepo;

@Service
public class EmployeeDetailsService {

	@Autowired
	private EmployeeDetailsRepo repo;
	
	public List <EmployeeDetailsDomain> listAll()
	{
		return repo.findAll();
	}
	public void save (EmployeeDetailsDomain employeedetails) {
		repo.save(employeedetails);
	}

	public EmployeeDetailsDomain get(long eid) {
		return repo.findById(eid).get();
	}
	public void delete(long eid)
	{
		repo.deleteById(eid);
	}
}
