package com.itbank.Day76;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.beans.BoardVO;
import com.itbank.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired private BoardService bs;

	@GetMapping("/post")
	public void getBoards(Model model) {
		model.addAttribute("list", bs.getLists());
	}
	
	@GetMapping("/view/{idx}")
	public ModelAndView view(@PathVariable int idx) {
		ModelAndView mav = new ModelAndView("board/view");
		
		mav.addObject("board", bs.getList(idx));
		
		return mav;
	}
	
	@GetMapping("/write")
	public void write() {}
	
	@PostMapping("/write")
	public ModelAndView write(BoardVO input) {
		ModelAndView mav = new ModelAndView("message");
		
		mav.addObject("row", bs.addBoard(input));
		mav.addObject("msg", "글 작성 완료");
		mav.addObject("loc", "board/post");
		
		return mav;
	}
	
	@GetMapping("update/{idx}")
	public ModelAndView update(@PathVariable int idx) {
		ModelAndView mav = new ModelAndView("board/write");
		
		mav.addObject("board", bs.getList(idx));
		
		return mav;
	}
	
	@PostMapping("update/{idx}")
	public ModelAndView update(BoardVO input) {
		ModelAndView mav = new ModelAndView("message");
		
		mav.addObject("row", bs.updateBoard(input));
		mav.addObject("msg", "글 수정 완료");
		mav.addObject("loc", "board/post");
		
		return mav;
	}
	
	@GetMapping("/delete/{idx}")
	public ModelAndView delete(@PathVariable int idx) {
		ModelAndView mav = new ModelAndView("message");
		
		mav.addObject("row", bs.deleteBoard(idx));
		mav.addObject("msg", "글 삭제 완료");
		mav.addObject("loc", "board/post");
		
		return mav;
	}
}
