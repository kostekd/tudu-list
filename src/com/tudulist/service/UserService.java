package com.tudulist.service;

import com.tudulist.entity.User;

public interface UserService {
	public void saveUser(User theUser);
	public User loadUser(String firstName, String lastName);
}
