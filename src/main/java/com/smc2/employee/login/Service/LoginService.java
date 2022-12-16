package com.smc2.employee.login.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smc2.employee.login.model.Admin;
import com.smc2.employee.login.model.Server;
import com.smc2.employee.login.model.User;
import com.smc2.employee.login.repository.AdminRepository;
import com.smc2.employee.login.repository.ServerRepositery;
import com.smc2.employee.login.repository.UserRepository;

@Service
public class LoginService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	AdminRepository adminRepository;
	
	@Autowired
	
	ServerRepositery serverRepositery;
	
public String  addUser(User user) {
	
	userRepository.save(user);
	
	return "Record save";
}

public String deleteUser(User user) {
	
	userRepository.delete(user);
	
	return "record deleted";
}
public List<User> getUser(String data) {

	return userRepository.findUserByAdminid(data);
}
//login page validation

public boolean checkAdmin(String id, String pswrd) {

	return adminRepository.findAll().stream().filter(data->data.getId().toString().equals(id.toString())&&data.getPswrd().toString().equals(pswrd.toString())).findFirst().isPresent();
}

public String checkUser(String id, String pswrd) {

	return userRepository.findAll().stream().filter(data->data.getId().toString().equals(id.toString())&&data.getPswrd().toString().equals(pswrd.toString()))
			.map(data->(data==null? "":data.getAdminid().toString())).collect(Collectors.joining("\n"));
	}

public boolean checkSubAdmin(String id) {
	
	
	return userRepository.findUserById(id).contains("true");
}

public String setServer(Server server) {
	serverRepositery.save(server);
	return "completed";
}

public String deleteServer(Server server) {
	serverRepositery.delete(server);
	return "completed";
}
public List<Server> getServer() {

	return serverRepositery.findAll();
}
}
