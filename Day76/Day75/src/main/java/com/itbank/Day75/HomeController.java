package com.itbank.Day75;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.service.BookService;
import com.itbank.service.LottoService;

@Controller
public class HomeController {
	
	@Autowired private LottoService ls;
	@Autowired private BookService bs;
	
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("lotto", ls.lotto());
		mav.addObject("version", bs.getVersion());
		mav.setViewName("home");
		
		return mav;
	}
	
}
