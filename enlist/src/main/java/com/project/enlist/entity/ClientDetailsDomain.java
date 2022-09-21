package com.project.enlist.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clients")
public class ClientDetailsDomain {

	 @Id
	 	private long id;
	    private String clientname;
	    private String principlecontact;
	    private String email;
	    private String address;
	    private String location;
	    
		public ClientDetailsDomain() {
			super();
			// TODO Auto-generated constructor stub
		}

		public ClientDetailsDomain(long id, String clientname, String principlecontact, String email, String address,
				String location) {
			super();
			this.id = id;
			this.clientname = clientname;
			this.principlecontact = principlecontact;
			this.email = email;
			this.address = address;
			this.location = location;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getClientname() {
			return clientname;
		}

		public void setClientname(String clientname) {
			this.clientname = clientname;
		}

		public String getPrinciplecontact() {
			return principlecontact;
		}

		public void setPrinciplecontact(String principlecontact) {
			this.principlecontact = principlecontact;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}
	    
}
