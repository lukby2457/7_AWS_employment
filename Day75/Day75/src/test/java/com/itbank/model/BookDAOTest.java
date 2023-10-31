package com.itbank.model;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itbank.model.BookDAO;
import com.itbank.model.vo.BookVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src\\main\\webapp\\WEB-INF\\spring\\root-context.xml"})
public class BookDAOTest {
	
	@Autowired
	private BookDAO dao;
	
	@Test
	public void connectionTest() {
		System.out.println("dao = " + dao);
		System.out.println("banner = " + dao.test());
	}
	
	@Test
	@Ignore		// 테스트를 위해 작성했지만 여러 테스트 중 테스트에서 제외하고 싶은 경우 사용
	public void ignore() {
		System.out.println("Test 실행에서 제외");
	}
	
	@Test
	public void selectAll() {
		List<BookVO> list = dao.selectAll();
		
		assertNotEquals(list.size(), 8);
	}
	
	@Test
	public void selectOne() {
		int idx = 108;
		
		BookVO book = dao.selectOne(idx);
		
		assertNotNull(book);
	}
	
	@Test
	public void insert() {
		BookVO book = new BookVO();
		
		book.setIdx(111);
		book.setTitle("1");
		book.setWriter("1");
		book.setPublisher("1");
		book.setP_date(null);
		book.setPrice(1);
		
		int row = dao.insert(book);
		
		assertNotEquals(row, 1);
	}

}
