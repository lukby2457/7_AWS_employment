package com.itbank.Day67;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.itbank.beans.PersonVO;

@Controller
public class Ex03Controller {

	@GetMapping("/ex03")
	public void ex03() {}
	// 참고) 메서드 명은 아무런 효과가 없다. 즉, 아무거나 작성해도 됨 (영문만 가능)
	
	@PostMapping("/ex03")
	public String ex03(Model model, PersonVO per) {
		// VO의 필드와 parameter의 이름이 일치하면 VO로 모두 처리 가능
		// 마치 jsp:useBean 태그와 비슷
		String name = per.getName();
		int age = per.getAge();
		
		String msg = name + "님은 ";
		msg += age >= 19 ? "성인" : "미성년자";
		msg += "입니다";
		
		model.addAttribute("msg", msg);
		
		return "ex01_result";
	}
}
