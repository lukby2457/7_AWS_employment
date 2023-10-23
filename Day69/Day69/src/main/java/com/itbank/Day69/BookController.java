package com.itbank.Day69;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itbank.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookService bs;

	@GetMapping("/list")
	public void list(Model model) {
		model.addAttribute("list", bs.getLists());
	}
	
	@GetMapping("/view")
	public void view(Model model, int idx) {
		model.addAttribute("view", bs.getList(idx));
	}
}
