package com.itbank.Day68;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itbank.service.Ex04Service;

@Controller
@RequestMapping("/ex04")
public class Ex04Controller {
	
	@Autowired
	private Ex04Service es;
	
	@GetMapping
	public void ex04(Model model) {
		model.addAttribute("ver", es.test());
		model.addAttribute("list", es.getPersons());
		model.addAttribute("depList", es.getDepartments());
	}
	
	
}
