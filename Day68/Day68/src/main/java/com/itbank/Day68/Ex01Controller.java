package com.itbank.Day68;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Ex01Controller {
	
	@GetMapping("/ex01")
	public void ex01() {}
	
	@PostMapping("/ex01")
	public String ex01(Model model, String name, int age) {
		String msg = name + "님은 ";
		msg += age >= 19 ? "성인" : "미성년자";
		msg += " 입니다";
		
		model.addAttribute("msg", msg);
		
		return "ex_result";
	}
	
	@GetMapping("/ex02")
	public void ex02() {}
	
	@PostMapping("/ex02")
	public ModelAndView ex02(@RequestParam Map<String, Object> data) {
		ModelAndView mav = new ModelAndView("ex_result");
		
		String inputAge = (String) data.get("age");
		int age = Integer.parseInt(inputAge);
		
		String msg = data.get("name") + "님은 ";
		msg += age >= 19 ? "성인" : "미성년자";
		msg += " 입니다";
		
		mav.addObject("msg", msg);
//		mav.setViewName("sample_result");
		
		return mav;
	}
	
}
