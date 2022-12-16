package com.smc2.employee.tickets.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smc2.employee.tickets.model.SerchCriteria;
import com.smc2.employee.tickets.model.Tickets;
import com.smc2.employee.tickets.model.TicketsDTO;
import com.smc2.employee.tickets.model.WeeklyTickets;
import com.smc2.employee.tickets.model.XLSheet;
import com.smc2.employee.tickets.service.TicketService;


@RestController
@RequestMapping("/ticket")
@CrossOrigin("*")
public class TicketController {

	@Autowired
	TicketService ticketService;
	
	@PostMapping("/add")
	public String addTicket(@RequestBody TicketsDTO ticket){
		return ticketService.addTicket(ticket);	
		
	}
	@GetMapping("/get/{data}")
	public List<Tickets> getTicket(@PathVariable String data){

		return ticketService.gTicket(data);	
		
	}
	@GetMapping("/getAll/{data}")
	public List<Tickets> getAllTicket(@PathVariable String data){
		return ticketService.getAllTicket(data);	
		
	}
	@GetMapping("/getAllMaster/{data}")
	public List<Tickets> getAllMasterTicket(@PathVariable String data){

		return ticketService.getAllMasterTicket(data);	
		
	}
	@GetMapping("/DeleteTable")
	public String getAllMasterTicket(){
		return ticketService.DeleteTable();	
		
	}
	@PostMapping("/DownloadTable")
	public List<XLSheet> DownloadTable(@RequestBody XLSheet data){

		return ticketService.DownloadTable(data);	
		
	}
	@GetMapping("/deletetickets")
	public String deleteTickets(){

		return ticketService.deletetickets();	
		
	}
	@PostMapping("/getuserdetails")
	public List<WeeklyTickets>  getWeekUserDetails(@RequestBody SerchCriteria data){
		return ticketService.getWeekUserDetails(data);
	}
	@PostMapping("/getSubAdminDetails")
	public List<WeeklyTickets>  getWeeksubAdminDetails(@RequestBody SerchCriteria data){
		return ticketService.getWeekUserDetails(data);
	}
	@GetMapping("/getuserOptions/{value}")
	public Set<String> getuserOptions(@PathVariable String value){
		return ticketService.getuserOptions(value);	
		
	}
	@GetMapping("/getuserDates/{value}")
	public Set<String> getuserDates(@PathVariable String value){
		return ticketService.getuserDates(value);	
		
	}
}
