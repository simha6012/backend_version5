package com.smc2.employee.login.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="Server")
public class Server {
	@Id
 String from;
 String to;
 Server(){
	 
 }
public Server(String from, String to) {
	super();
	this.from = from;
	this.to = to;
}
@Override
public String toString() {
	return "Server [from=" + from + ", to=" + to + "]";
}
public String getFrom() {
	return from;
}
public void setFrom(String from) {
	this.from = from;
}
public String getTo() {
	return to;
}
public void setTo(String to) {
	this.to = to;
}
 
}
