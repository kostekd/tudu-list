package com.tudulist.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tudulist.entity.User;

@Repository
public class UserDAOImplementation implements UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveUser(User theUser) {
		//get the current session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//save the customer ... finally
		currentSession.save(theUser);
	}

	@Override
	public User loadUser(String firstName, String lastName) {
		//create User instance
		User theUser = new User();
		
		//boolean
		boolean inDatabase = false;
		
		//get the current session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//create an user Instance
		System.out.println("com.tudulist: Inside UserDAOImpl");
		
		try {
			Query<User> query = currentSession.createQuery("from User where firstName='"
					+ firstName + "'"
								, User.class);
			theUser = query.getSingleResult();
		}
		catch(Exception e) {
			System.out.println("Failed to connect to database");
			theUser = null;
		}
		
		return theUser;
	}

}
