package com.project.enlist.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Immutable;

@Entity
public class CandidateDisp {
	@Id
	private String Fname;
	private String jobTitle;
	private String assignedOn;
	private String clientName;


	public CandidateDisp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CandidateDisp( String fname, String jobTitle, String assignedOn, String clientName) {
		super();
		Fname = fname;
		this.jobTitle = jobTitle;
		this.assignedOn = assignedOn;
		this.clientName = clientName;
	}


	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getAssignedOn() {
		return assignedOn;
	}

	public void setAssignedOn(String assignedOn) {
		this.assignedOn = assignedOn;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	
	@Override
	public String toString() {
		return "CandidateDisp [Fname=" + Fname + ", jobTitle=" + jobTitle + ", assignedOn=" + assignedOn
				+ ", clientName=" + clientName + "]";
	}


}
