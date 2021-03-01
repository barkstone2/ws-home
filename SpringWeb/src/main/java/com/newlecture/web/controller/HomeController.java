package com.newlecture.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@GetMapping("/index")
	public String adsf() {
		
		return "home.index";
	}
	
	@RequestMapping("/help")
	public String aaa() {
		
		return "home.help";
	}
}
