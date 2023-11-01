package com.itbank.Day76;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itbank.beans.AccountVO;
import com.itbank.service.AccountService;

@Controller
@RequestMapping("/account")
public class AccountController {

	@Autowired private AccountService as;
	
	@GetMapping("/list")
	public void accList(Model model) {
		model.addAttribute("list", as.getAccounts());
	}
	
	@GetMapping("/login")
	public void login() {}
	
	@PostMapping("/login")
	public String login(AccountVO input, HttpSession session) {
		input = as.login(input);
		
		if (input != null) {
			session.setAttribute("user", input);
		}
		
		return "redirect:/";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("user");
		
		return "redirect:/";
	}
	
}
