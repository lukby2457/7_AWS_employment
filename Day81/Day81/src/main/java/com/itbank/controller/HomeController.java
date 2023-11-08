package com.itbank.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.itbank.service.HomeService;

@Controller
public class HomeController {
	
	private Logger log = LoggerFactory.getLogger(getClass());
	
	@Autowired private HomeService hs;
	
	@GetMapping("/")
	public String home(Model model) {
		
		log.error("로그 : Error");
		log.warn("로그 : Warning");
		log.info("로그 : Info");
		log.debug("로그 : debug");
		log.trace("로그 : trace");
		
		model.addAttribute("ver", hs.getVersion());
		
		return "home";
	}
	
	@GetMapping("/ex01")
	public String ex01() {
		log.trace("실행 완료");
		return "ex01";
	}
}
