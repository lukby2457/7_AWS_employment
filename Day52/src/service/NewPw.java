package service;

import java.util.Random;

public class NewPw {
	public static String getPassword() {	// 기능만 필요하면 static을 사용하기도 한다
		Random ran = new Random();
		String chs = "abcdefghijklmnopqrstuvwxyz0123456789";
		
		String newPw = "";
		
		for(int i = 1; i <= 6; i++) {
			int n = ran.nextInt(chs.length());
			
			newPw += chs.charAt(n);
		}
		
		return newPw;
	}
}
