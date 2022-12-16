package com.smc2.employee.tickets.model;

import org.springframework.stereotype.Component;

@Component
public  class Denomination{
	TicketDetails RS100;
	TicketDetails RS60;
	TicketDetails RS30;
	TicketDetails A;
	TicketDetails B;
	TicketDetails C;
	TicketDetails AB;
	TicketDetails BC;
	TicketDetails AC;
	@Override
	public String toString() {
		return "Denomination [RS100=" + RS100 + ", RS60=" + RS60 + ", RS30=" + RS30 + ", A=" + A + ", B=" + B + ", C="
				+ C + ", AB=" + AB + ", BC=" + BC + ", AC=" + AC + "]";
	}
	public Denomination(TicketDetails rS100, TicketDetails rS60, TicketDetails rS30, TicketDetails a, TicketDetails b,
			TicketDetails c, TicketDetails aB, TicketDetails bC, TicketDetails aC) {
		super();
		RS100 = rS100;
		RS60 = rS60;
		RS30 = rS30;
		A = a;
		B = b;
		C = c;
		AB = aB;
		BC = bC;
		AC = aC;
	}
	
	public Denomination() {
		
	}
	public TicketDetails getRS100() {
		return RS100;
	}
	public void setRS100(TicketDetails rS100) {
		RS100 = rS100;
	}
	public TicketDetails getRS60() {
		return RS60;
	}
	public void setRS60(TicketDetails rS60) {
		RS60 = rS60;
	}
	public TicketDetails getRS30() {
		return RS30;
	}
	public void setRS30(TicketDetails rS30) {
		RS30 = rS30;
	}
	public TicketDetails getA() {
		return A;
	}
	public void setA(TicketDetails a) {
		A = a;
	}
	public TicketDetails getB() {
		return B;
	}
	public void setB(TicketDetails b) {
		B = b;
	}
	public TicketDetails getC() {
		return C;
	}
	public void setC(TicketDetails c) {
		C = c;
	}
	public TicketDetails getAB() {
		return AB;
	}
	public void setAB(TicketDetails aB) {
		AB = aB;
	}
	public TicketDetails getBC() {
		return BC;
	}
	public void setBC(TicketDetails bC) {
		BC = bC;
	}
	public TicketDetails getAC() {
		return AC;
	}
	public void setAC(TicketDetails aC) {
		AC = aC;
	}
	
	
}