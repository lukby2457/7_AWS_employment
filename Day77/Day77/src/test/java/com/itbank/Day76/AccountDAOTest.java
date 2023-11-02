package com.itbank.Day76;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itbank.beans.AccountVO;
import com.itbank.model.AccountDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class AccountDAOTest {

	@Autowired AccountDAO dao;
	
	@Test
	public void connectionTest() {
		System.out.println("dao = " + dao);
		
		assertNotNull(dao.test());
		
		System.out.println(dao.test());
	}
	
	@Test
	public void selectAllTest() {
		List<AccountVO> list = dao.selectAll();
		
		assertNotNull(list);
		
		for(AccountVO row : list) {
			System.err.println(row);
		}
	}
	
}
