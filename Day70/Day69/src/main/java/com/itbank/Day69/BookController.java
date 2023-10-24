package com.itbank.Day69;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.beans.BookVO;
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
	
	@GetMapping("/add")
	public String add() {
		return "book/write";
	}
	
	@PostMapping("/add")
	public String add(BookVO input) {
		bs.insert(input);
		
		return "redirect:/book/list";
	}
	
	@GetMapping("/update")
	public ModelAndView update(int idx) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("data", bs.getList(idx));
		mav.setViewName("book/write");
		return mav;
	}
	
	@PostMapping("/update")
	public String update(BookVO input) {
		bs.update(input);
		
		return "redirect:/book/view?idx=" + input.getIdx();
	}
	
	@GetMapping("/delete")
	public String delete(int idx) {
		bs.delete(idx);
		
		return "redirect:/book/list";
	}
	
}
