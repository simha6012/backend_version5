package com.smc2.employee.tickets.model;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class TicketDetails{
	Set<String> ticketNo;
	Collection<String> quantity;
	@Override
	public String toString() {
		return "TicketDetails [ticketNo=" + ticketNo + ", quantity=" + quantity + "]";
	}
	public TicketDetails(Set<String> ticketNo, Collection<String> quantity) {
		super();
		this.ticketNo = ticketNo;
		this.quantity = quantity;
	}
	public TicketDetails() {
		
	}
	public Set<String> getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(Set<String> ticketNo) {
		this.ticketNo = ticketNo;
	}
	public Collection<String> getQuantity() {
		return quantity;
	}
	public void setQuantity(Collection<String> quantity) {
		this.quantity = quantity;
	}
	
}