package com.itbank.Day67;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itbank.beans.PersonVO;

@Controller
@RequestMapping("/ex04")	// 이전의 webServlet
public class Ex04Controller {

	@GetMapping
	public void ex04() {}
	
//	@GetMapping("/hello")	// ex04/hello
	
	@PostMapping
	public String ex04(Model model, PersonVO per) {
		String msg = per.getName() + "님은 ";
		msg += per.getAge() >= 19 ? "성인" : "미성년자";
		msg += "입니다";
		
		model.addAttribute("msg", msg);
		
		return "ex01_result";
	}
}
