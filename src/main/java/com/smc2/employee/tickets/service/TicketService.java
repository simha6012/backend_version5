package com.smc2.employee.tickets.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smc2.employee.tickets.model.Denomination;
import com.smc2.employee.tickets.model.SerchCriteria;
import com.smc2.employee.tickets.model.TicketDetails;
import com.smc2.employee.tickets.model.TicketTable;
import com.smc2.employee.tickets.model.Tickets;
import com.smc2.employee.tickets.model.TicketsDTO;
import com.smc2.employee.tickets.model.WeeklyTickets;
import com.smc2.employee.tickets.model.XLSheet;
import com.smc2.employee.tickets.repository.TicketsRepository;
import com.smc2.employee.tickets.repository.WeeklyTicketsRepositery;
import com.smc2.employee.tickets.repository.XlSheets;


@Service
public class TicketService {
    Map<String,Map<String,String>> ticketDetails=new HashMap<String,Map<String,String>>();
	Map<String,String> priceDetails=new HashMap<String,String>();  
	
	@Autowired
	TicketsRepository ticketRepository;
	 
	@Autowired
	WeeklyTickets weeklyTickets;
	
	@Autowired
	WeeklyTicketsRepositery weeklyTicketsRepositery;
	
	@Autowired
	XlSheets xlSheet;
	@Autowired
	Denomination denomination;
	
	@Autowired
	TicketTable ticketTable;
	@Autowired
	TicketDetails ticketDetail;

	public String addTicket(TicketsDTO ticket) {
	Tickets entity=	modelConverter(ticket);
		
		return "hello";
	}
	
	private Tickets modelConverter(TicketsDTO tickets) {
		Tickets ticket=new Tickets();
		
		
		boolean CheckUser=ticketRepository.findAll().stream().filter(data->data.getUserid().equals(tickets.getUserid())).findAny().isPresent();
	if(CheckUser) {
		
	List<Tickets> userdetail=ticketRepository.findAll().stream().filter(data->data.getUserid().equals(tickets.getUserid()))
	.collect(Collectors.toList());
	boolean CheckDenomination= userdetail.stream().filter(data->data.getTicketDetails().containsKey(tickets.getTicket())).findFirst().isPresent();
	
	if(CheckDenomination) {
		priceDetails.clear();
		ticketDetails.clear();
		ticketDetails.putAll(userdetail.get(0).getTicketDetails());
		priceDetails.putAll(ticketDetails.get(tickets.getTicket()));
		
//		Checking TicketNumber is prasent or not
	boolean CheckTicketNumber=priceDetails.containsKey(tickets.getTicketNumber());
if(CheckTicketNumber) {
	ticket.setUserid(tickets.getUserid());
	ticket.setAdminid(tickets.getAdminid());
	ticket.setDate(tickets.getDate());
	ticket.setMasterKey(tickets.getMasterKey());
	ticket.setBoxORAllPort(tickets.getBoxORAllPort());
int num1=Integer.parseInt(priceDetails.get(tickets.getTicketNumber()));
int num2=Integer.parseInt(tickets.getQuantity());
priceDetails.put(tickets.getTicketNumber(),num1+num2+"");
ticketDetails.put(tickets.getTicket(), priceDetails);
ticket.setTicketDetails(ticketDetails);
ticketRepository.save(ticket);
}else {
	ticket.setUserid(tickets.getUserid());
	ticket.setAdminid(tickets.getAdminid());
	ticket.setDate(tickets.getDate());
	ticket.setMasterKey(tickets.getMasterKey());
	ticket.setBoxORAllPort(tickets.getBoxORAllPort());
	priceDetails.put(tickets.getTicketNumber(),tickets.getQuantity());
	ticketDetails.put(tickets.getTicket(), priceDetails);
	ticket.setTicketDetails(ticketDetails);
	ticketRepository.save(ticket);
}

		
	}else {
		priceDetails.clear();
		priceDetails.put(tickets.getTicketNumber(),tickets.getQuantity());
		ticketDetails.clear();
		ticketDetails.put(tickets.getTicket(), priceDetails);
		ticketDetails.putAll(userdetail.get(0).getTicketDetails());
		ticket.setUserid(tickets.getUserid());
		ticket.setAdminid(tickets.getAdminid());
		ticket.setMasterKey(tickets.getMasterKey());
		ticket.setDate(tickets.getDate());
		ticket.setTicketDetails(ticketDetails);
		ticket.setBoxORAllPort(tickets.getBoxORAllPort());
		ticketRepository.save(ticket);
	}
	
	}else {
//		clering the priceDetails
		priceDetails.clear();
		priceDetails.put(tickets.getTicketNumber(),tickets.getQuantity());
		ticketDetails.clear();
		ticketDetails.put(tickets.getTicket(), priceDetails);
		ticket.setUserid(tickets.getUserid());
		ticket.setAdminid(tickets.getAdminid());
		ticket.setMasterKey(tickets.getMasterKey());
		ticket.setDate(tickets.getDate());
		ticket.setTicketDetails(ticketDetails);
		ticket.setBoxORAllPort(tickets.getBoxORAllPort());
		ticketRepository.save(ticket);
	}
		return ticket;
	}
	public List<Tickets> gTicket(String data) {
		
		return ticketRepository.findTicketsByUserid(data);
	}

	public List<Tickets> getAllTicket(String data) {
		return ticketRepository.findTicketsByAdminid(data);
	}

	public List<Tickets> getAllMasterTicket(String data) {
	
		return  ticketRepository.findTicketsByMasterKey(data);
	}

	public List<XLSheet> DownloadTable(XLSheet data) {
//		ticketRepository.findTicketsByMasterKey(data).stream().forEach(value->{
//			xlSheet.setName(value.getAdminid());
//			for(int i=0;i<value.getTicketDetails().size();i++) {
//				Map<String,Map<String,String>> ticketsDetail=value.getTicketDetails();
//	ticketsDetail.entrySet().stream().forEach(vty->System.out.println(vty));
//		}
//			System.out.println(xlSheet);
//		});syso
		xlSheet.save(data);
		System.out.println(xlSheet.findAll());
		return xlSheet.findAll();
	}
public String	DeleteTable(){
	xlSheet.deleteAll();

	return "deleted";
		
	}

public String deletetickets() {
	ticketRepository.findAll().stream().forEach(data->{
		
		weeklyTickets.setUserid(data.getUserid());
		weeklyTickets.setTicketDetails(data.getTicketDetails());
		weeklyTickets.setMasterKey(data.getMasterKey());
		weeklyTickets.setDate(data.getDate());
		weeklyTickets.setBoxORAllPort(data.getBoxORAllPort());
		weeklyTickets.setAdminid(data.getAdminid());
		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now));
		   weeklyTickets.setSesion(dtf.format(now));
		   weeklyTicketsRepositery.save(weeklyTickets);
		
	});
//	weeklyTicketsRepositery.save();
	ticketRepository.deleteAll();
	ticketRepository.deleteAll();
	return "new session started";
}

public List<WeeklyTickets> getWeekUserDetails(SerchCriteria data) {

    if(data.getDate()==null && data.getSession()==null){
    	return weeklyTicketsRepositery.findWeeklyTicketsByUserid(data.getUserid());
	}else if(data.getDate()==null && data.getSession()!=null) {
		return weeklyTicketsRepositery.findEmployeeBysearch(data.getUserid(), data.getSession());
	}else if(data.getDate()!=null && data.getSession()==null) {

		return weeklyTicketsRepositery.findEmployeeBysearch(data.getUserid(), data.getDate());
	}else {
		return weeklyTicketsRepositery.findWeeklyTicketsBYSearch(data.getUserid(),data.getDate(),data.getSession());
	}
}
//findWeeklyTicketsBYsubadminSearch
public List<WeeklyTickets> getWeeksubAdminDetails(SerchCriteria data) {

    if(data.getDate()==null && data.getSession()==null){
    	return weeklyTicketsRepositery.findWeeklyTicketsByAdminid(data.getUserid());
	}else if(data.getDate()==null && data.getSession()!=null) {
		return weeklyTicketsRepositery.findWeeklyTicketsBYsubadminSearch(data.getUserid(), data.getSession());
	}else if(data.getDate()!=null && data.getSession()==null) {

		return weeklyTicketsRepositery.findWeeklyTicketsBYsubadminSearch(data.getUserid(), data.getDate());
	}else {
		return weeklyTicketsRepositery.findWeeklyTicketsBYsubadminSearch(data.getUserid(),data.getDate(),data.getSession());
	}
}
public Set<String> getuserOptions(String data) {
	Set<String> list=new HashSet<String>();
weeklyTicketsRepositery.findAll().stream().forEach(action->{list.add(action.getSesion());});
	return list;
}
public Set<String> getuserDates(String data) {
	Set<String> list1=new HashSet<String>();
weeklyTicketsRepositery.findAll().stream().forEach(action->{list1.add(action.getDate());});
	return list1;
}
}
