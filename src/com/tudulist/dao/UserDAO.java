package com.tudulist.dao;

import com.tudulist.entity.User;

public interface UserDAO {
	public void saveUser(User theUser);
	public User loadUser(String firstName, String lastName);
}
