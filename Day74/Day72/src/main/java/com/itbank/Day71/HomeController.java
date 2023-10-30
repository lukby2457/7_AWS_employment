package com.itbank.Day71;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.itbank.service.BoardService;

@Controller
public class HomeController {
	
	@Autowired
	private BoardService bs;
	
	@GetMapping(value = {"/", "/{page}"})
	public String home(Model model, @PathVariable(required = false) Integer page) {
		model.addAttribute("test", bs.getTest());
		model.addAttribute("map", bs.getBoards(page));
		
		return "home";
	}
	
}
