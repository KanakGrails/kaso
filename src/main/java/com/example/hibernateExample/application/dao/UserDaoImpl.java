package com.example.hibernateExample.application.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Service;

import com.example.hibernateExample.application.User;
@Service
public class UserDaoImpl implements InUserDAO{

	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;
	@Override
	public void addUser(User uesr) {
		EntityManager entityManager=entityManagerFactory.createEntityManager();
	entityManager.getTransaction().begin();
	entityManager.persist(uesr);
	entityManager.getTransaction().commit();
	
	}

}
