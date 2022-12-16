package com.smc2.employee.login.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.smc2.employee.login.model.User;

public interface UserRepository  extends MongoRepository<User,String> {

	String findUserById(String id);
	List<User> findUserByAdminid(String data);

}
