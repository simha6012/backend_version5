package com.smc2.employee.tickets.model;


import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("tickets")
public class Tickets {

	@Id
	String userid;
	String adminid;
	String date;
	Map<String,Map<String,String>> ticketDetails;
	String boxORAllPort;
	String masterKey;

	public String getMasterKey() {
		return masterKey;
	}

	public void setMasterKey(String masterKey) {
		this.masterKey = masterKey;
	}

	public Tickets() {
		
	}

	@Override
	public String toString() {
		return "Tickets [userid=" + userid + ", adminid=" + adminid + ", date=" + date + ", ticketDetails="
				+ ticketDetails + ", boxORAllPort=" + boxORAllPort + ", masterKey=" + masterKey + "]";
	}


	public Tickets(String userid, String adminid, String date, Map<String, Map<String, String>> ticketDetails,
			String boxORAllPort, String masterKey) {
		super();
		this.userid = userid;
		this.adminid = adminid;
		this.date = date;
		this.ticketDetails = ticketDetails;
		this.boxORAllPort = boxORAllPort;
		this.masterKey = masterKey;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getAdminid() {
		return adminid;
	}

	public void setAdminid(String adminid) {
		this.adminid = adminid;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Map<String, Map<String, String>> getTicketDetails() {
		return ticketDetails;
	}

	public void setTicketDetails(Map<String, Map<String, String>> ticketDetails) {
		this.ticketDetails = ticketDetails;
	}

	public String getBoxORAllPort() {
		return boxORAllPort;
	}

	public void setBoxORAllPort(String boxORAllPort) {
		this.boxORAllPort = boxORAllPort;
	}

}
