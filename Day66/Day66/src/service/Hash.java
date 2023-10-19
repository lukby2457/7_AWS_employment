package service;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash {
	public static String getHash(String pw) {
		try {
		MessageDigest md = MessageDigest.getInstance("SHA-512");
		
		md.reset();
		
		md.update(pw.getBytes());
		
		String hash = String.format("%0128x", new BigInteger(1, md.digest()));
		
		return hash;
		
		} catch (NoSuchAlgorithmException e) {
			// getInstance(알고리즘)에서 알고리즘이 없을때만 발생하는 에러이기 때문에 없어도 무방하다
		}
		
		return null;
	}
}
