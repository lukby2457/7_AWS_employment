package com.itbank.Day71;

import java.sql.SQLIntegrityConstraintViolationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.beans.BoardVO;
import com.itbank.beans.ReplyVO;
import com.itbank.service.BoardService;
import com.itbank.service.ReplyService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService bs;
	
	@Autowired
	private ReplyService rs;
	
	@GetMapping("/view")
	public ModelAndView view(int idx) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("row", bs.getBoard(idx));
		mav.addObject("repList", rs.getReply(idx));
		mav.addObject("repCount", rs.getReplyCount(idx));
		
		return mav;
	}
	
	@PostMapping("/view")
	public ModelAndView view(ReplyVO input) {
		ModelAndView mav = new ModelAndView("msg");
		
		mav.addObject("row", rs.addReply(input));
		mav.addObject("message", "댓글 작성 완료");
		
		return mav;
	}
	
	@GetMapping("/write")
	public String write() {
		return "board/add";
	}
	
	@PostMapping("/write")
	public ModelAndView write(BoardVO input) {
		ModelAndView mav = new ModelAndView("msg");
		
		mav.addObject("row", bs.addBoard(input));
		mav.addObject("message", "작성 완료");
		
		return mav;
	}
	
	@GetMapping("/update/{idx}")
	public ModelAndView update(@PathVariable int idx) {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("row", bs.getBoard(idx));
		mav.setViewName("board/add");
		
		return mav;
	}
	
	@PostMapping("/update/{idx}")
	public ModelAndView update(BoardVO input) {
		// 만약 동일한 이름의 필드가 VO에 있으면 자동으로 받아진다
		
		ModelAndView mav = new ModelAndView("msg");
		
		mav.addObject("row", bs.updateBoard(input));
		mav.addObject("message", "수정 완료");
		
		return mav;
	}
	
	@GetMapping("/delete/{idx}")
	public ModelAndView delete(@PathVariable int idx) {
		ModelAndView mav = new ModelAndView("msg");
		
		mav.addObject("row", bs.deleteBoard(idx));
		mav.addObject("message", "삭제 완료");
		
		return mav;
	}
	
	// 예외는 보통 service나 dao에서 발생
	// 여기서 발생한 예외는 보통 controller까지 전가가 된다
	// controller에서도 예외를 처리하지 않으면 에러페이지가 출력된다
	@ExceptionHandler(SQLIntegrityConstraintViolationException.class)
	public ModelAndView ex() {
		ModelAndView mav = new ModelAndView("msg");
		
		mav.addObject("row", 0);
		mav.addObject("message", "작성 실패");
		
		return mav;
	}

}
