package com.smc2.employee.tickets.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.smc2.employee.tickets.model.Tickets;
import com.smc2.employee.tickets.model.XLSheet;

public interface XlSheets extends MongoRepository<XLSheet, String> {



}
