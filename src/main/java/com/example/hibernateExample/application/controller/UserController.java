package com.example.hibernateExample.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hibernateExample.application.User;
import com.example.hibernateExample.application.controller.service.InUserService;
@RestController
public class UserController {
	@Autowired
	InUserService service;

	@RequestMapping("/user")
	public void addUser() {
		System.out.println("********Controller**************");
		User user1 = new User();
		user1.setId(1);
		user1.setName("Kaso");
		service.addUser(user1);
	}

	@RequestMapping("/greeting")
	public String greeting() {
		System.out.println("################ HELLLOOOOOOOOOOOO ###########");
		return "HIIIIIIIIIIIIII";
	}

}
