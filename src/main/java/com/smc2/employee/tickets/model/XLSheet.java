package com.smc2.employee.tickets.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Document("xlSheetRows")
public class XLSheet {
	@Id
  String name;
  String rs100Tickets;
  String rs60Tickets;
  String rs40Tickets;
  String rs30Tickets;
  String rs20Tickets;
  String aTickets;
  String bTickets;
  String cTickets;
  String abTickets;
  String bcTickets;
  String acTickets;
  String abcTickets;
public XLSheet() {

}
public XLSheet(String name, String rs100Tickets, String rs60Tickets, String rs40Tickets, String rs30Tickets,
		String rs20Tickets, String aTickets, String bTickets, String cTickets, String abTickets, String bcTickets,
		String acTickets, String abcTickets) {
	super();
	this.name = name;
	this.rs100Tickets = rs100Tickets;
	this.rs60Tickets = rs60Tickets;
	this.rs40Tickets = rs40Tickets;
	this.rs30Tickets = rs30Tickets;
	this.rs20Tickets = rs20Tickets;
	this.aTickets = aTickets;
	this.bTickets = bTickets;
	this.cTickets = cTickets;
	this.abTickets = abTickets;
	this.bcTickets = bcTickets;
	this.acTickets = acTickets;
	this.abcTickets = abcTickets;
}
@Override
public String toString() {
	return "XLSheet [name=" + name + ", rs100Tickets=" + rs100Tickets + ", rs60Tickets=" + rs60Tickets
			+ ", rs40Tickets=" + rs40Tickets + ", rs30Tickets=" + rs30Tickets + ", rs20Tickets=" + rs20Tickets
			+ ", aTickets=" + aTickets + ", bTickets=" + bTickets + ", cTickets=" + cTickets + ", abTickets="
			+ abTickets + ", bcTickets=" + bcTickets + ", acTickets=" + acTickets + ", abcTickets=" + abcTickets + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getRs100Tickets() {
	return rs100Tickets;
}
public void setRs100Tickets(String rs100Tickets) {
	this.rs100Tickets = rs100Tickets;
}
public String getRs60Tickets() {
	return rs60Tickets;
}
public void setRs60Tickets(String rs60Tickets) {
	this.rs60Tickets = rs60Tickets;
}
public String getRs40Tickets() {
	return rs40Tickets;
}
public void setRs40Tickets(String rs40Tickets) {
	this.rs40Tickets = rs40Tickets;
}
public String getRs30Tickets() {
	return rs30Tickets;
}
public void setRs30Tickets(String rs30Tickets) {
	this.rs30Tickets = rs30Tickets;
}
public String getRs20Tickets() {
	return rs20Tickets;
}
public void setRs20Tickets(String rs20Tickets) {
	this.rs20Tickets = rs20Tickets;
}
public String getaTickets() {
	return aTickets;
}
public void setaTickets(String aTickets) {
	this.aTickets = aTickets;
}
public String getbTickets() {
	return bTickets;
}
public void setbTickets(String bTickets) {
	this.bTickets = bTickets;
}
public String getcTickets() {
	return cTickets;
}
public void setcTickets(String cTickets) {
	this.cTickets = cTickets;
}
public String getAbTickets() {
	return abTickets;
}
public void setAbTickets(String abTickets) {
	this.abTickets = abTickets;
}
public String getBcTickets() {
	return bcTickets;
}
public void setBcTickets(String bcTickets) {
	this.bcTickets = bcTickets;
}
public String getAcTickets() {
	return acTickets;
}
public void setAcTickets(String acTickets) {
	this.acTickets = acTickets;
}
public String getAbcTickets() {
	return abcTickets;
}
public void setAbcTickets(String abcTickets) {
	this.abcTickets = abcTickets;
}

  
}
