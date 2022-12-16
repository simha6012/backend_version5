package com.smc2.employee.login.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.smc2.employee.login.model.Admin;

public interface AdminRepository  extends MongoRepository<Admin,String> {


}
