package com.itbank.Day69;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.itbank.service.HomeService;

@Controller
public class HomeController {
	
	@Autowired
	private HomeService hs;
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("time", hs.getTime());
		model.addAttribute("list", hs.getAccounts());
		return "home";
	}
	
}
