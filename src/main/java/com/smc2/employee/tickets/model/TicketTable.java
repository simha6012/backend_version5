package com.smc2.employee.tickets.model;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class TicketTable {

	String userid;
	String date;
	Denomination denomination;
	public TicketTable(String userid, String date, Denomination denomination) {
		super();
		this.userid = userid;
		this.date = date;
		this.denomination = denomination;
	}
	public TicketTable() {
		
	}
	@Override
	public String toString() {
		return "TicketTable [userid=" + userid + ", date=" + date + ", denomination=" + denomination + "]";
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
	public Denomination getDenomination() {
		return denomination;
	}
	public void setDenomination(Denomination denomination) {
		this.denomination = denomination;
	}
	
}
