package com.smc2.employee.tickets.model;


public class TicketsDTO {
	String userid;
	String adminid;
	String date;
	String  ticket;
	String ticketNumber;
	String quantity;
	String boxORAllPort;
	String masterKey;
	public TicketsDTO() {
		
	}
	@Override
	public String toString() {
		return "TicketsDTO [userid=" + userid + ", adminid=" + adminid + ", date=" + date + ", ticket=" + ticket
				+ ", ticketNumber=" + ticketNumber + ", quantity=" + quantity + ", boxORAllPort=" + boxORAllPort
				+ ", masterKey=" + masterKey + "]";
	}

	public TicketsDTO(String userid, String adminid, String date, String ticket, String ticketNumber, String quantity,
			String boxORAllPort, String masterKey) {
		super();
		this.userid = userid;
		this.adminid = adminid;
		this.date = date;
		this.ticket = ticket;
		this.ticketNumber = ticketNumber;
		this.quantity = quantity;
		this.boxORAllPort = boxORAllPort;
		this.masterKey = masterKey;
	}
	public String getMasterKey() {
		return masterKey;
	}
	public void setMasterKey(String masterKey) {
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
	public String getTicket() {
		return ticket;
	}
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
	public String getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getBoxORAllPort() {
		return boxORAllPort;
	}
	public void setBoxORAllPort(String boxORAllPort) {
		this.boxORAllPort = boxORAllPort;
	}
	
}
