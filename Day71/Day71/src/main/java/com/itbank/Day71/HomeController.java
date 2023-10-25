package com.itbank.Day71;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.itbank.service.BoardService;

@Controller
public class HomeController {
	
	@Autowired
	private BoardService bs;
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("test", bs.getTest());
		model.addAttribute("map", bs.getBoards());
		
		return "home";
	}
	
}
