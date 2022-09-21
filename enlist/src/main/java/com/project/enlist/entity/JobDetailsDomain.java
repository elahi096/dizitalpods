package com.project.enlist.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jobdetails")
public class JobDetailsDomain {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long jobid;
	private String jobtitle;
	private String domain;
	private String rolename;
	private String clientname;
	private String techskills;
	private String exprange;
	private String jobtype;
	private String jobdesc;
	private String salaryrange;
	private String openpositions;
	private String jobresponsibilities;
	private String joiningdate;
	private String benefits;
	private String joinedby;
	private String createdby;
	private String createdon;
	private String assignedon;
	private String assignedby;
	
	public JobDetailsDomain() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JobDetailsDomain(long jobid, String jobtitle, String domain, String rolename, String clientname,
			String techskills, String exprange, String jobtype, String jobdesc, String salaryrange,
			String openpositions, String jobresponsibilities, String joiningdate, String benefits, String joinedby,
			String createdby, String createdon, String assignedon, String assignedby) {
		super();
		this.jobid = jobid;
		this.jobtitle = jobtitle;
		this.domain = domain;
		this.rolename = rolename;
		this.clientname = clientname;
		this.techskills = techskills;
		this.exprange = exprange;
		this.jobtype = jobtype;
		this.jobdesc = jobdesc;
		this.salaryrange = salaryrange;
		this.openpositions = openpositions;
		this.jobresponsibilities = jobresponsibilities;
		this.joiningdate = joiningdate;
		this.benefits = benefits;
		this.joinedby = joinedby;
		this.createdby = createdby;
		this.createdon = createdon;
		this.assignedon = assignedon;
		this.assignedby = assignedby;
	}



	public long getJobid() {
		return jobid;
	}

	public void setJobid(long jobid) {
		this.jobid = jobid;
	}

	public String getJobtitle() {
		return jobtitle;
	}

	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public String getClientname() {
		return clientname;
	}

	public void setClientname(String clientname) {
		this.clientname = clientname;
	}

	public String getTechskills() {
		return techskills;
	}

	public void setTechskills(String techskills) {
		this.techskills = techskills;
	}

	public String getExprange() {
		return exprange;
	}

	public void setExprange(String exprange) {
		this.exprange = exprange;
	}

	public String getJobtype() {
		return jobtype;
	}

	public void setJobtype(String jobtype) {
		this.jobtype = jobtype;
	}

	public String getJobdesc() {
		return jobdesc;
	}

	public void setJobdesc(String jobdesc) {
		this.jobdesc = jobdesc;
	}

	public String getSalaryrange() {
		return salaryrange;
	}

	public void setSalaryrange(String salaryrange) {
		this.salaryrange = salaryrange;
	}

	public String getOpenpositions() {
		return openpositions;
	}

	public void setOpenpositions(String openpositions) {
		this.openpositions = openpositions;
	}

	public String getJobresponsibilities() {
		return jobresponsibilities;
	}

	public void setJobresponsibilities(String jobresponsibilities) {
		this.jobresponsibilities = jobresponsibilities;
	}
	
	public String getJoiningdate() {
		return joiningdate;
	}

	public void setJoiningdate(String joiningdate) {
		this.joiningdate = joiningdate;
	}

	public String getBenefits() {
		return benefits;
	}

	public void setBenefits(String benefits) {
		this.benefits = benefits;
	}

	public String getJoinedby() {
		return joinedby;
	}

	public void setJoinedby(String joinedby) {
		this.joinedby = joinedby;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public String getCreatedon() {
		return createdon;
	}

	public void setCreatedon(String createdon) {
		this.createdon = createdon;
	}

	public String getAssignedon() {
		return assignedon;
	}

	public void setAssignedon(String assignedon) {
		this.assignedon = assignedon;
	}

	public String getAssignedby() {
		return assignedby;
	}

	public void setAssignedby(String assignedby) {
		this.assignedby = assignedby;
	}
	
	
}
