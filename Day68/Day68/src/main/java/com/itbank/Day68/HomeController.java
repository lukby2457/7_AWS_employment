package com.itbank.Day68;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;	// library

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	// IoC : 제어의 역전
}
