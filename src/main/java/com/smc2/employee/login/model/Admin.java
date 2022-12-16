package com.smc2.employee.login.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "admin")
public class Admin {

	@Id
	String id;
	String pswrd;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPswrd() {
		return pswrd;
	}
	public void setPswrd(String pswrd) {
		this.pswrd = pswrd;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", pswrd=" + pswrd + "]";
	}
	public Admin(String id, String pswrd) {
		super();
		this.id = id;
		this.pswrd = pswrd;
	}
	public Admin() {
		
	}
	
}
