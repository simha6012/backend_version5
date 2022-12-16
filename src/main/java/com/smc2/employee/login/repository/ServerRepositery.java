package com.smc2.employee.login.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.smc2.employee.login.model.Server;
import com.smc2.employee.login.model.User;

public interface ServerRepositery extends MongoRepository<Server,String> {

}
