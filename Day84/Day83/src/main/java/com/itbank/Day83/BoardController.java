package com.itbank.Day83;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.vo.BoardVO;
import com.itbank.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired private BoardService bs;

	@GetMapping("/write")
	public void write() {}
	
	@PostMapping("/write")
	public String write(BoardVO input) throws IOException {
		bs.insertBoard(input);
		
		return "redirect:/";
	}
	
	@GetMapping("/view/{idx}")
	public ModelAndView view(@PathVariable int idx) throws IOException {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("form", bs.getBoard(idx));
		mav.setViewName("board/view");
		
		return mav;
	}
	
	@GetMapping("/delete/{idx}")
	public String delete(@PathVariable int idx) throws IOException {
		bs.deleteBoard(idx);
		
		return "redirect:/";
	}
	
	@GetMapping("/update/{idx}")
	public String update(@PathVariable int idx, Model model) throws IOException {
		model.addAttribute("board", bs.getBoard(idx));
		
		return "board/update";
	}
	
	@PostMapping("/update/{idx}")
	public ModelAndView update(BoardVO input) throws IOException {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("row", bs.updateBoard(input));
		mav.setViewName("redirect:/");
		
		return mav;
	}
	
}
