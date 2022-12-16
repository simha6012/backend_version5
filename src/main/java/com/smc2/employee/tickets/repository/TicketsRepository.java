package com.smc2.employee.tickets.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.smc2.employee.tickets.model.Tickets;

public interface TicketsRepository extends MongoRepository<Tickets, String>{

	List<Tickets> findTicketsByUserid(String data);

	List<Tickets> findTicketsByAdminid(String data);

	List<Tickets> findTicketsByMasterKey(String data);

	

}
