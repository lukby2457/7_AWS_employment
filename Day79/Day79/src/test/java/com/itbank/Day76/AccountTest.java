package com.itbank.Day76;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itbank.beans.AccountVO;
import com.itbank.components.SHA512;
import com.itbank.model.AccountDAO;
import com.itbank.service.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class AccountTest {
	
	@Autowired private AccountService as;
	@Autowired private AccountDAO dao;
	@Autowired private SHA512 hash;
	
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
		
		user = dao.selectOne(testAcc);
		
		assertNotNull(user);
	}

	@Test
	@Ignore
	public void testSignUp() {
		AccountVO user = testAcc;
		
		user.setUserid("testCase1");
		user.setNick("테스트시 삭제 후 진행");
		
		int row = 0;
		
		try {
			row = as.signUp(user);
		} catch(DuplicateKeyException e) {}
		
		assertNotEquals("이미 있는 계정", 0, row);
	}
	
	@Test
	@Ignore
	public void testSignOut() {
		AccountVO user = testAcc;
		
		user.setIdx(1034);
		
		int row = as.signOut(user.getIdx());
		
		assertNotEquals(0, row);
	}
	
	@Test
	public void testSign() {
		testAcc.setUserid("testCase1");
		testAcc.setNick("테스트시 삭제 후 진행");
		
		// 비번이 일치하지 않아서 selectOne을 반환하지 못 함
		AccountVO delAcc = dao.selectTest(testAcc);
		
		// 1. 계정이 있으면 제거 후
		if (delAcc != null) {
			int row = dao.delete(delAcc.getIdx());
			assertNotEquals(0, row);
		}
		
		// 2. insert 수행
		int row = as.signUp(testAcc);
		assertNotEquals("이미 있는 계정", 0, row);
	}
	
	@Test
	@Ignore
	public void testChange() {
		testAcc.setIdx(1038);
		testAcc.setUserpw("123456");
		testAcc.setEmail("testAcc@naver.com");
		
		int row = as.change(testAcc);
		
		assertNotEquals(0, row);
	}
	
	@Test
	public void testGetHash() {
		String testPw = "4dff4ea340f0a823f15d3f4f01ab62eae0e5da579ccb851f8db9dfe84c58b2b37b89903a740e1ee172da793a6e79d560e5f7f9bd058a12a280433ed6fa46510a";
		
		assertEquals(testPw, hash.getHash("1"));
	}
	
	@Test
	public void testGetID() {
		String id = as.findId("test@kakao.com");
		
		assertNotNull(id);
	}
	
	@Test
	public void testGetPW() {
		String msg = as.findPw(testAcc);
		
		assertNotNull(msg);
		
		System.out.println(msg);
	}
}
