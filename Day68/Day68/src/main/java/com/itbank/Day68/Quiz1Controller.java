package com.itbank.Day68;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.service.Quiz1Service;

@Controller
@RequestMapping("/quiz1")
public class Quiz1Controller {
	
	@Autowired
	private Quiz1Service qs;

	@GetMapping
	public void quiz1() {}
	
	@PostMapping
	public ModelAndView quiz1(int count) {
		ModelAndView mav = new ModelAndView();
		List<String> rList = new ArrayList<String>();
		
		try {
			rList = qs.lotto(count);
		} catch (InterruptedException e) {}
		
		mav.addObject("lotto", rList);
		mav.setViewName("quiz1_result");
		
		return mav;
	}
}
