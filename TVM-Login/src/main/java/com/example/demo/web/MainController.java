package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	
	@GetMapping("/admin_page")
	public String adminpage() {
		return "index2";
	}
	
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
}