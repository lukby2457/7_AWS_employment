package com.itbank.Day76;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.beans.AccountVO;
import com.itbank.service.AccountService;

@Controller
@RequestMapping("/account")
public class AccountController {

	@Autowired private AccountService as;
	
	// message.jsp로 보낸 데이터 세팅
	private ModelAndView setMessage(int row, String msg, String loc) {
		ModelAndView mav = new ModelAndView("message");
		
		mav.addObject("msg", msg);
		mav.addObject("row", row);
		mav.addObject("loc", loc);
		
		return mav;
	}
	
	@GetMapping("/list")
	public void accList(Model model) {
		model.addAttribute("list", as.getAccounts());
	}
	
	@GetMapping("/login")
	public void login() {}
	
	@PostMapping("/login")
	public ModelAndView login(AccountVO input, HttpSession session) {
		
		Map<String, Object> map = as.login(input, session);
		
		int row = (int) map.get("row");
		String msg = (String) map.get("msg");
		
		ModelAndView mav = setMessage(row, msg, null);
		
		return mav;
	}
	
	@GetMapping("/logout")
	public ModelAndView logout(HttpSession session) {
		String msg = "로그아웃 되었습니다";
		int row = 1;
		
		session.removeAttribute("user");
		
		ModelAndView mav = setMessage(row, msg, null);
		
		return mav;
	}
	
	@GetMapping("/signup")
	public String signUp() {
		return "account/signUp";
	}
	
	@PostMapping("/signup")
	public ModelAndView signUp(AccountVO input) {
		String msg = "회원 가입 성공";
		int row = as.signUp(input);
		
		ModelAndView mav = setMessage(row, msg, "account/login");
		
		return mav;
	}
	
	@GetMapping("/mypage")
	public String myPage() {
		return "account/myPage";
	}
	
	@PostMapping("/update/{idx}")
	public ModelAndView myPage(AccountVO input, HttpSession session) {
		String msg = "회원 정보 수정 성공. 다시 로그인 해주세요";
		int row = as.change(input);
		
		session.removeAttribute("user");
		
		ModelAndView mav = setMessage(row, msg, "account/login");
		
		return mav;
	}
	
	@GetMapping("/delete")
	public ModelAndView signOut(int idx, HttpSession session) {
		String msg = "회원 탈퇴 완료";
		int row = as.signOut(idx);
		
		session.removeAttribute("user");
		
		ModelAndView mav = setMessage(row, msg, null);
//		ModelAndView mav = setMessage(row, msg, "account/logout");
		
		return mav;
	}
	
	@GetMapping("/find")
	public void find() {}
	
	@GetMapping("/findID")
	public String findID(Model model, String email) {
		String id = as.findId(email);
		String msg = "당신의 ID는 " + id + "입니다";
		
		model.addAttribute("result", msg);
		
		return "account/findResult";
	}
	
	@ExceptionHandler(DuplicateKeyException.class)
	public ModelAndView ex(DuplicateKeyException e) {
		System.out.println("메세지 : " + e.getMessage());
		
		ModelAndView mav = setMessage(0, "입력 정보를 다시 확인해 주세요", null);
		
		return mav;
	}
}
