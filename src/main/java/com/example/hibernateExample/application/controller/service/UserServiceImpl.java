package com.example.hibernateExample.application.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hibernateExample.application.User;
import com.example.hibernateExample.application.dao.InUserDAO;

@Service
public class UserServiceImpl implements InUserService{

	@Autowired
	InUserDAO userDao;
	@Override
	public Boolean addUser(User user) {

		userDao.addUser(user);
		return null;
	}

}
