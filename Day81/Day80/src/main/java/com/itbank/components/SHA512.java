package com.itbank.components;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.stereotype.Component;

@Component
public class SHA512 {
	public String getHash(String userpw) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA-512");
		
		md.reset();
		md.update(userpw.getBytes());
		
		String pw = String.format("%0128x", new BigInteger(1, md.digest()));
		// signum -> 1 양수 / 0 0 / -1 음수
		
		return pw;
	}
}
