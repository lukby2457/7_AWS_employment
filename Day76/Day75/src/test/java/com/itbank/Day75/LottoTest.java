package com.itbank.Day75;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itbank.service.LottoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src\\main\\webapp\\WEB-INF\\spring\\root-context.xml"})
public class LottoTest {
	
	@Autowired
	private LottoService ls;
	
	private int num;
	
	@Before		// @Test마다 이전에 먼저 실행된다. 공통적인 값을 세팅시 사용
	public void setNum() {
		num = 15;
		System.out.println("\nnum 셋팅");
	}
	
	@Test
	public void lottoTest() {
		System.out.println("num = " + num);
		System.out.println("ls = " + ls);
		System.out.println("lotto = " + ls.lotto());
		
		num -= 5;
	}
	
	@Test
	public void haveNum() {
		System.out.println("num = " + num);
		System.out.println("test");
		
		num -= 10;
	}
	
	@After		// @Test마다 이후에 실행된다. 각 테스트의 결과나 자원 해제 등을 테스트
	public void close() {
		System.out.println("num = " + num + "\n");
	}
}
