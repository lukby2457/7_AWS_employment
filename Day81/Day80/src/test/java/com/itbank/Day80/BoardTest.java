package com.itbank.Day80;

import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itbank.components.Paging;
import com.itbank.model.BoardDAO;
import com.itbank.model.ReplyDAO;
import com.itbank.model.vo.BoardVO;
import com.itbank.model.vo.ReplyVO;
import com.itbank.service.BoardService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class BoardTest {

	@Autowired private BoardService bs;
	@Autowired private ReplyDAO rdao;
	@Autowired private BoardDAO dao;
	
	@Test
	public void test() {
		System.out.println("dao = " + dao);
		
		String test = dao.test();
		System.out.println(test);
		
		assertNotNull(test);
	}
	
	@Test
	public void getBoards() {
		int totalBoard = dao.countAll();
		
		System.out.println(totalBoard);
		
		Paging p = new Paging(1, totalBoard);
		
		List<BoardVO> list = dao.selectAll(p);
		
		assertNotNull(list);
		
		System.out.println(list.size());
	}
	
	@Test
	public void getBoard() {
		int idx = 2540;
		Map<String, Object> result = bs.getBoard(idx);
		
		assertNotNull(result);
	}
	
	@Test
	public void getReplys() {
		int idx = 2540;
		List<ReplyVO> list = rdao.selectAll(idx);
		
		assertNotNull(list);
	}
	
	@Test
	public void insert() {
		BoardVO input = new BoardVO();
		input.setTitle("추후 삭제");
		input.setWriter("테스트1");
		input.setContents("테스트용 더미입니다. 추후 삭제 요망");
		
		String path = bs.insertBoard(input);
		
		assertNotNull(path);
	}
	
}
