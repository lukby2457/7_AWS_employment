package com.itbank.Day69;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.beans.AccountVO;
import com.itbank.service.HomeService;

@Controller
@RequestMapping("/acc")
public class AccountController {
	
	@Autowired
	private HomeService hs;

	@GetMapping("/view")
	public void view(Model model, int idx) {
		model.addAttribute("acc", hs.getAccount(idx));
	}
	
	@GetMapping("/write")
	public void write() {}
	
	@PostMapping("/write")
	public String write(AccountVO input) {
		hs.write(input);
		
		return "redirect:/";
		// viewName에 접두어로 redirect:를 기입하면 리다이렉트를 수행
	}
	
	@GetMapping("/update")
	public ModelAndView update(int idx) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("acc", hs.getAccount(idx));
		mav.setViewName("acc/write");
		
		return mav;
	}
	
	@PostMapping("/update")
	public String update(AccountVO input) {
		hs.update(input);
		
		return "redirect:/acc/view?idx=" + input.getIdx();
	}
	
	@GetMapping("/delete")
	public String delete(int idx) {
		hs.delete(idx);
		
		return "redirect:/";
	}
	
}
