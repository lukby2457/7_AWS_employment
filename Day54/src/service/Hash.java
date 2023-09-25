package service;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class Hash {
	public static String getHash(String pw) throws NoSuchAlgorithmException {
		String hash = "";
		
		MessageDigest md = MessageDigest.getInstance("SHA-512");
		
		md.reset();
		
		md.update(pw.getBytes());
		
		hash = String.format("%0128x", new BigInteger(1, md.digest()));
		
		return hash;
	}
	
	public static String getPassword() {
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
