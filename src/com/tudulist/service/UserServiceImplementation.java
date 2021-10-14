package com.tudulist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tudulist.dao.UserDAO;
import com.tudulist.entity.User;

@Service
public class UserServiceImplementation implements UserService {
	
	@Autowired
	private UserDAO userDAO;
	
	@Override
	@Transactional
	public void saveUser(User theUser) {
		userDAO.saveUser(theUser);
	}
	
	@Override
	@Transactional
	public User loadUser(String firstName, String lastName) {
		System.out.println("com.tudulist: Inside UserServiceImpl");
		return userDAO.loadUser(firstName, lastName);		
	}
	
}
