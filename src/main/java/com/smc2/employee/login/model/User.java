package com.smc2.employee.login.model;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="user")
public class User {

	String name;
	String id;
	String pswrd;
	private boolean access;
	String adminid;
   public String getName() {
		return name;
	}
   
	@Override
public String toString() {
	return "User [name=" + name + ", id=" + id + ", pswrd=" + pswrd + ", access=" + access + ", adminid=" + adminid
			+ "]";
}

	public User(String name, String id, String pswrd, boolean access, String adminid) {
		super();
		this.name = name;
		this.id = id;
		this.pswrd = pswrd;
		this.access = access;
		this.adminid = adminid;
	}

	public void setName(String name) {
		this.name = name;
	}
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
	public boolean isAccess() {
		return access;
	}
	public void setAccess(boolean access) {
		this.access = access;
	}
	public String getAdminid() {
		return adminid;
	}
	public void setAdminid(String adminid) {
		this.adminid = adminid;
	}

	public User() {
		
	}
	
	
}
