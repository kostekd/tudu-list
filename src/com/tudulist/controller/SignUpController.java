package com.tudulist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tudulist.entity.User;
import com.tudulist.service.UserService;

@Controller
@RequestMapping("/sign-up")
public class SignUpController {
	
	//use Spring dependency injection
	@Autowired
	private UserService userService;
	
	//showing sign up form and adding new User to the MVC model
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		//creating new object 
		User theUser = new User();
		
		//adding to the model
		theModel.addAttribute("user",theUser);
		
		return "sign-up";
	}
	
	//display the confirmation of Signing up and pass Model User Data
	@RequestMapping("/user-confirmation")
	public String saveConfirmation(@ModelAttribute("user") User theUser) {
		System.out.println(theUser);
		userService.saveUser(theUser);
		return "user-confirmation";
	}
	
}
