package com.tudulist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//This class is responsible for controlling the topBar of the mainPage

@Controller
public class TopBarController {
	
	//redirect to login page
	@GetMapping("/aboutUs")
	public String showAboutUs() {
		return "about-us";
	}
	
	//redirect to login page
	@GetMapping("/log-in")
	public String showLogIn() {
		return "login";
	}
	
}
