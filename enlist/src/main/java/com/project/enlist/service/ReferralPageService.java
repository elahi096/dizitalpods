package com.project.enlist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.enlist.entity.ReferralPageDomain;
import com.project.enlist.repository.ReferralPageRepo;

@Service
public class ReferralPageService {
	@Autowired
	private ReferralPageRepo r;
	
	public void save(ReferralPageDomain ref) {
		r.save(ref);
	}
	 
	public List<ReferralPageDomain> fetch(){
		return r.findAll();
	}
	
	public ReferralPageDomain get(int referId) {
		return r.findById(referId).get();
	}
	
	public void delete(int referId) {
		r.deleteById(referId);
	}
}
