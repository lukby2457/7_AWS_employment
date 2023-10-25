package com.itbank.Day71;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itbank.beans.BoardVO;
import com.itbank.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService bs;
	
	@GetMapping("/view")
	public void view(Model model, int idx) {
		model.addAttribute("row", bs.getBoard(idx));
	}
	
	@GetMapping("/write")
	public String write() {
		return "board/add";
	}
	
	@PostMapping("/write")
	public String write(BoardVO input) {
		bs.addBoard(input);
		
		return "redirect:/";
	}
	
	@GetMapping("/update")
	public String update(Model model, int idx) {
		model.addAttribute("row", bs.getBoard(idx));
		
		return "board/add";
	}
	
	@PostMapping("/update")
	public String update(BoardVO input) {
		bs.updateBoard(input);
		
		return "redirect:/board/view?idx=" + input.getIdx();
	}
	
	@GetMapping("/delete")
	public String delete(int idx) {
		bs.deleteBoard(idx);
		
		return "redirect:/";
	}

}
