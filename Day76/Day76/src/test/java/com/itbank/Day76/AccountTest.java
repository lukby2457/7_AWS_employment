package com.itbank.Day76;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itbank.beans.AccountVO;
import com.itbank.model.AccountDAO;
import com.itbank.service.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class AccountTest {
	
	@Autowired private AccountService as;
	@Autowired private AccountDAO dao;
	
	private AccountVO testAcc;
	
	@Before
	public void setUp() {
		testAcc = dao.test1(1002);
	}

	@Test
	public void testGetAccounts() {
		System.out.println("as = " + as);
		
		List<AccountVO> list = as.getAccounts();
		
		assertNotNull(list);
	}
	
	@Test
	public void testLogin() {
		AccountVO user;
		
		user = as.login(testAcc);
		
		assertNotNull(user);
	}

}
