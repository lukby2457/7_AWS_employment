package com.itbank.Day80;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.vo.BoardVO;
import com.itbank.service.BoardService;
import com.itbank.service.ReplyService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired private BoardService bs;
	@Autowired private ReplyService rs;
	
	@GetMapping("/view")
	public ModelAndView view(int idx) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("row", bs.getBoard(idx));
		mav.addObject("reply", rs.getReplys(idx));
		mav.setViewName("board/view");
		
		return mav;
	}
	
	@GetMapping("/write")
	public void write() {}
	
	@PostMapping("/write")
	public ModelAndView write(BoardVO input) {
		ModelAndView mav = new ModelAndView();
		
		String path = bs.insertBoard(input);
		mav.setViewName("redirect:/" + path);
		
		return mav;
	}
}
