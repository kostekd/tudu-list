package com.tudulist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomePageController {
	
	//Welcome page that will be display
	@RequestMapping("/")
	public String showPage() {
		return "home-page";
	}
}
