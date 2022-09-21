package com.project.enlist.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="referrals")
public class ReferralPageDomain {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int referId;
	private String fullName;
	private String experience;
	private String age;
	private String jobPost;
	private String referedBy;
	private String linkedIn;
	
	public ReferralPageDomain() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReferralPageDomain(int referId, String fullName, String experience, String age, String jobPost, String referedBy,
			String linkedIn) {
		super();
		this.referId = referId;
		this.fullName = fullName;
		this.experience = experience;
		this.age = age;
		this.jobPost = jobPost;
		this.referedBy = referedBy;
		this.linkedIn = linkedIn;
	}
	public int getReferId() {
		return referId;
	}
	public void setReferId(int referId) {
		this.referId = referId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getJobPost() {
		return jobPost;
	}
	public void setJobPost(String jobPost) {
		this.jobPost = jobPost;
	}
	public String getReferedBy() {
		return referedBy;
	}
	public void setReferedBy(String referedBy) {
		this.referedBy = referedBy;
	}
	public String getLinkedIn() {
		return linkedIn;
	}
	public void setLinkedIn(String linkedIn) {
		this.linkedIn = linkedIn;
	}
	
	
	
}
