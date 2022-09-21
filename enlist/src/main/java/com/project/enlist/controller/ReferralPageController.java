package com.project.enlist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.enlist.entity.ReferralPageDomain;
import com.project.enlist.service.ReferralPageService;

@RestController
public class ReferralPageController {
	@Autowired
	private ReferralPageService rs;
	
	@PostMapping("/referral")
	public void addReferals(@RequestBody ReferralPageDomain ref) {
		rs.save(ref);
	} 
	
	@GetMapping("/referral")
	public List<ReferralPageDomain> listAll(){
		return rs.fetch();
	}
	
	@GetMapping("/referral/{referId}")
	public ReferralPageDomain getSingle(@PathVariable int referId) {
		return rs.get(referId);
	}
	
	@DeleteMapping("/referral/{referId}")
	public void delete(@PathVariable int referId) {
		rs.delete(referId);
	}
}
