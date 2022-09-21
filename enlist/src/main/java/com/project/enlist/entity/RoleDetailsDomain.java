package com.project.enlist.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="role")
public class RoleDetailsDomain {

	@Id
	private Long roleid;
	private String rolename;

	public RoleDetailsDomain() {
			super();
			
		}

	public RoleDetailsDomain(Long roleid, String rolename) {
			super();
			this.roleid = roleid;
			this.rolename = rolename;
		}

	public Long getRoleid() {
		return roleid;
	}

	public void setRoleid(Long roleid) {
		this.roleid = roleid;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

}
