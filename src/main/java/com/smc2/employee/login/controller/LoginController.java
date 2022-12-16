package com.smc2.employee.login.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smc2.employee.login.Service.LoginService;
import com.smc2.employee.login.model.Server;
import com.smc2.employee.login.model.User;




@RestController
@RequestMapping(path ="/login")
@CrossOrigin("*")
public class LoginController {

	@Autowired
	LoginService loginService;
	@CrossOrigin("*")
	@PostMapping(value = "/adduser")
	public  String addkUser(@RequestBody User user) {
		return loginService.addUser(user);
	}
	
	@CrossOrigin("*")
	@PostMapping("/deleteuser")
	public String deleteUser(@RequestBody User user) {
		
		
		return loginService.deleteUser(user);
		
	}
	
	@CrossOrigin("*")
	@GetMapping(value = "/getuser/{data}")
	public  List<User> getUser(@PathVariable String data) {
		return loginService.getUser(data);
	}
	
//	Login page
	@GetMapping(value = "/user")
	public  String checkUser(@RequestParam String id,String pswrd) {
		return loginService.checkUser(id,pswrd);
	}
	@GetMapping(value = "/subadmin")
	public  boolean checkSubAdmin(@RequestParam String id) {
		return loginService.checkSubAdmin(id);
	}
	
	@CrossOrigin("*")
	@GetMapping(value = "/admin")
	public  boolean checkAdmin(@RequestParam String id,String pswrd) {
		return loginService.checkAdmin(id,pswrd);
	}
 @PostMapping(value = "/setServer")
 public String setServer( @RequestBody Server server){
	 return loginService.setServer(server);
 }

 @PostMapping(value = "/deleteServer")
 public String deleteServer( @RequestBody Server server){
	 loginService.deleteServer(server);
	 return "record deleted";
 }
 @GetMapping(value = "/getServer")
 public List<Server> getServer(){
	 return loginService.getServer();
 }
}
