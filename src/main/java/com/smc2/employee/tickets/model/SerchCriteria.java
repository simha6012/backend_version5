package com.smc2.employee.tickets.model;


public class SerchCriteria {
    String userid;
    String date;
    String session;
	@Override
	public String toString() {
		return "SerchCriteria [userid=" + userid + ", date=" + date + ", session=" + session + "]";
	}
	public SerchCriteria(String userid, String date, String session) {
		super();
		this.userid = userid;
		this.date = date;
		this.session = session;
	}

    public SerchCriteria() {	
    	
    }
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
    
}
