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
@RequestMapping("/log-in")
public class LogInPageController {
	
	//use Spring dependency injection
	@Autowired
	private UserService userService;
	
	@GetMapping("/showForm")
	public String showPage(Model theModel) {
		//creating an instance of User object to pass it into the model
		User theUser = new User();
		
		//adding to the model
		theModel.addAttribute("user",theUser);
		
		return "login";
	}
	
	@PostMapping("/user-confirmation")
	public String showUserConfirmation(@ModelAttribute("user") User theUser) {
		
		System.out.println("com.tudulist: In showUserConfirmation"); //debugging
		System.out.println(theUser); //debugging
		User user1 = userService.loadUser(theUser.getFirstName(), theUser.getLastName());
		
		//check if user was retrieved from the Database if not return failed-login.jsp page
		if(user1 == null) {
			return "failed-login";
		}
		else {
			return "user-confirmation";
		}
	}
}
