package com.itbank.Day80;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.vo.AccountVO;
import com.itbank.service.AccountService;

@Controller
@RequestMapping("/account")
public class AccountController {
	
	@Autowired private AccountService as;
	
	@GetMapping("/login")
	public String login() {
		return "account/login";
	}
	
	@PostMapping("/login")
	public ModelAndView login(AccountVO input, HttpSession session) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("user1", as.login(input, session));
		mav.setViewName("redirect:/");
		
		return mav;
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("user");
		
		return "redirect:/";
	}
	
	@GetMapping("/signup")
	public void signUp() {}
	
	@PostMapping("/signup")
	public ModelAndView signUp(AccountVO input) {
		ModelAndView mav = new ModelAndView();
		
		as.signUp(input);
		
		mav.setViewName("redirect:/");
		
		return mav;
	}
	
}
