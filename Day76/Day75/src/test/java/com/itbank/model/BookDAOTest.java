package com.itbank.model;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	public void selectAllTest() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("type", "title");
		map.put("search", "");
		
		List<BookVO> list = dao.selectAll(map);
		
		assertNotNull(list);
	}
	
	@Test
	public void selectOneTest() {
		int idx = 108;
		
		BookVO book = dao.selectOne(idx);
		
		assertNotNull(book);
		
		System.out.println(book);
	}
	
	// 테스트에서 호출해서 사용하는 메서드도 작성 가능
	// 테스트 실행시 @Test 어노테이션 붙은 것만 프레임워크가 실행
	private BookVO setField() {
		BookVO book = new BookVO();
		
		book.setIdx(2222);
		book.setTitle("2");
		book.setWriter("2");
		book.setPublisher("2");
//		book.setP_date(new Date(1698796800000L));
		book.setP_date(Date.valueOf("2023-05-05"));
		book.setPrice(2);
		
		return book;
	}
	
	@Test
	@Ignore
	public void insertTest() {
		BookVO book = setField();
		
		int row = dao.insert(book);
		
		assertNotEquals(row, 0);
	}
	
	@Test
	@Ignore
	public void deleteTest() {
		int idx = 4444;
		
		int row = dao.delete(idx);
		
		assertNotEquals(0, row);
	}
	
	@Test
	public void updateTest() {
		BookVO input = setField();
		
		// idx 번호를 테이블에서 가져와서 random으로 뽑는 로직을 만들어서 사용해도 된다
		
		int row = dao.update(input);
		
		assertNotEquals(0, row);
	}
	
}
