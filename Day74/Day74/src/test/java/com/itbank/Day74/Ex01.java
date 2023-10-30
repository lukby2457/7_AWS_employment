package com.itbank.Day74;

import org.junit.Test;

public class Ex01 {
	
	// @Test
	// - Junit이 실행할 메서드로 등록
	// - 반환형은 항상 void
	@Test
	public void test1() {
		System.out.println(5 / 0);
	}
	
	@Test
	public void test2() {
		System.out.println("2. 두번째 메서드");
	}
}
