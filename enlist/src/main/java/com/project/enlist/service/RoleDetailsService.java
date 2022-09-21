package com.project.enlist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.enlist.entity.RoleDetailsDomain;
import com.project.enlist.repository.RoleDetailsRepo;

@Service
public class RoleDetailsService {

	@Autowired
	private RoleDetailsRepo repo;
	
	public List<RoleDetailsDomain> listAll() {
	       return repo.findAll();
	    }
	     
	public void save(RoleDetailsDomain roledetails)
	{
		repo.save(roledetails);
	}
//	public void save(RoleDetailsDomain role) {
//        repo.save(role);
//    }
	     
	    public RoleDetailsDomain get(long id) {
	       return repo.findById(id).get();
	    }
	     
	    public void delete(long id) {
	        repo.deleteById(id);
	    }
}
