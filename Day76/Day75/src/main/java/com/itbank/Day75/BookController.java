package com.itbank.Day75;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.vo.BookVO;
import com.itbank.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {
	
	@Autowired private BookService bs;
	
	@RequestMapping(value = "/list")	// get, post 같이 처리
	public ModelAndView book(@RequestParam Map<String, Object> param) {
		ModelAndView mav = new ModelAndView();
		
//		System.out.println(param.get("type"));
//		System.out.println(param.get("search"));
		
		mav.addObject("list", bs.getBooks(param));
		mav.addObject("map", param);
		
		return mav;
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
		mav.addObject("message", "책 정보 등록 완료");
		
		return mav;
	}
	
	@GetMapping("/update/{idx}")
	public ModelAndView update(@PathVariable int idx) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("row", bs.getBook(idx));
		mav.setViewName("book/write");
		
		return mav;
	}
	
	@PostMapping("/update/{idx}")
	public ModelAndView update(BookVO input) {
		ModelAndView mav = new ModelAndView("msg");
		
		mav.addObject("row", bs.update(input));
		mav.addObject("message", "책 정보 수정 완료");
		
		return mav;
	}
	
	@GetMapping("/delete/{idx}")
	public ModelAndView delete(@PathVariable int idx) {
		ModelAndView mav = new ModelAndView("msg");
		
		mav.addObject("row", bs.delete(idx));
		mav.addObject("message", "책 정보 삭제 완료");
		
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
