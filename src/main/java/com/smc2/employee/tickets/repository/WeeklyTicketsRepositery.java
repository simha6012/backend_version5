package com.smc2.employee.tickets.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.smc2.employee.tickets.model.WeeklyTickets;

public interface WeeklyTicketsRepositery  extends MongoRepository<WeeklyTickets, String>{

  

	List<WeeklyTickets> findWeeklyTicketsByUserid(String data);
	
	
	@Query("{'userid':?0,$or:[{'date':?1},{'sesion':?1}]}")
	List<WeeklyTickets> findEmployeeBysearch(String userId , String dateORsesion);
	
	@Query("{'userid':?0,'date':?1,'sesion':?2}")
	List<WeeklyTickets> findWeeklyTicketsBYSearch(String userId , String date, String session);
	
	List<WeeklyTickets> findWeeklyTicketsByAdminid(String data);
	
	@Query("{'adminid':?0,$or:[{'date':?1},{'sesion':?1}]}")
	List<WeeklyTickets> findWeeklyTicketsBYsubadminSearch(String userId , String dateORsesion);
	
	@Query("{'adminid':?0,'date':?1,'sesion':?2}")
	List<WeeklyTickets> findWeeklyTicketsBYsubadminSearch(String userId , String date, String session);
}
