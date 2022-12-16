package com.smc2.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.smc2.employee"})
public class LoginmanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginmanagementApplication.class, args);
	}

}
