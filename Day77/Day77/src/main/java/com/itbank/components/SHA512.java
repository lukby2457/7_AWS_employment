package com.itbank.components;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.stereotype.Component;

@Component
public class SHA512 {
	
//	private SHA512 obj;
//	
//	private SHA512() {};
//	
//	public SHA512 getInstance() {
//		if (obj == null) {
//			obj = new SHA512();
//		}
//		
//		return obj;
//	}
	
	public String getHash(String userpw) {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-512");
			
			md.reset();
			md.update(userpw.getBytes());
			
			String pw = String.format("%0128x", new BigInteger(1, md.digest()));
			
			return pw;
			
		} catch (NoSuchAlgorithmException e) {}
		
		return null;
	}
}
