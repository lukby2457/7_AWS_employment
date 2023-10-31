package com.itbank.Day75;

import java.sql.SQLIntegrityConstraintViolationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
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
	
	@GetMapping("/list")
	public void book(Model model) {
		model.addAttribute("list", bs.getBooks());
	}
	
	@GetMapping("/view")
	public void view(Model model, int idx) {
		model.addAttribute("book", bs.getBook(idx));
	}
	
	@GetMapping("/add")
	public String add() {
		return "book/write";
	}
	
	@PostMapping("/add")
	public ModelAndView add(BookVO input) {
		ModelAndView mav = new ModelAndView("msg");
		
		mav.addObject("row", bs.insert(input));
		mav.addObject("message", "책 등록 완료");
		
		return mav;
	}
	
	
	
	@ExceptionHandler(SQLIntegrityConstraintViolationException.class)
	public ModelAndView ex() {
		ModelAndView mav = new ModelAndView("msg");
		
		mav.addObject("row", 0);
		mav.addObject("message", "작성 실패");
		
		return mav;
	}

}
