package com.itbank.Day76;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itbank.beans.BoardVO;
import com.itbank.service.BoardService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class BoardTest {
	
	@Autowired BoardService bs;
	
	@Test
	public void getBoards() {
		List<BoardVO> list = bs.getLists();
		
		assertNotNull(list);
	}

	@Test
	public void getBoard() {
		int idx = 2530;
		
		BoardVO row = bs.getList(idx);
		
		assertNotNull(row);
	}
	
	// 한번에 너무 실행되서 확인이 힘들면
	// 별도의 Test를 만들어서 확인하는 방식도 추천
}
