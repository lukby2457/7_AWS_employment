package service;

import java.util.Random;

public class NewPassword {
	public static String getPassword() {
		
		Random ran = new Random();
		String chs = "abcdefghijklmnopqrstuvwxyz0123456789";
	
		String newPw = "";
	
		for (int i = 1; i <= 6; i++) {
			int n = ran.nextInt(chs.length());	// 0 ~ 35
			
			newPw += chs.charAt(n);
		}
		
		return newPw;
	}
}
