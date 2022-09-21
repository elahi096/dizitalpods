package com.project.enlist.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="employees")
public class EmployeeDetailsDomain {
	@Id
    private Long eid;
    private String employeename;
    private String designation;
    private String username;
    private String password;
    private String confirmpassword;
    private String email;
    private String rollid;
    
	public EmployeeDetailsDomain() {
		super();
		
	}
	
	public EmployeeDetailsDomain(Long eid, String employeename, String designation, String username, String password,
			String confirmpassword, String email, String rollid) {
		super();
		this.eid = eid;
		this.employeename = employeename;
		this.designation = designation;
		this.username = username;
		this.password = password;
		this.confirmpassword = confirmpassword;
		this.email = email;
		this.rollid = rollid;
	}


	public Long getEid() {
		return eid;
	}
	public void setEid(Long eid) {
		this.eid = eid;
	}
	
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getRollid() {
		return rollid;
	}
	public void setRollid(String rollid) {
		this.rollid = rollid;
	}
	
	@Override
	public String toString() {
		return "EmployeeDetailsDomain [eid=" + eid + ", employeename=" + employeename + ", designation=" + designation
				+ ", username=" + username + ", password=" + password + ", confirmpassword=" + confirmpassword + " , email=" + email + ", rollid=" + rollid + "]";
	}
	
}
