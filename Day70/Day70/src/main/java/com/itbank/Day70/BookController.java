package com.itbank.Day70;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.vo.BookVO;
import com.itbank.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {
	
	@Autowired private BookService bs;
	
	@GetMapping("/add")
	public void add() {}
	
	@PostMapping("/add")
	public String add(BookVO input) {
		bs.addBook(input);
		
		return "redirect:/";
	}
	
	@GetMapping("/delete")
	public String delete(int idx) {
		bs.deleteBook(idx);
		
		return "redirect:/";
	}
	
	@GetMapping("/update")
	public ModelAndView update(int idx) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("book", bs.getBook(idx));
		mav.setViewName("book/add");
		
		return mav;
	}
	
	@PostMapping("/update")
	public String update(BookVO input) {
		bs.updateBook(input);
		
		return "redirect:/";
	}
}
