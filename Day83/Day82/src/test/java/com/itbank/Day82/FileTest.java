package com.itbank.Day82;

import java.io.File;

import org.junit.Test;

public class FileTest {

	@Test
	public void ex01() {
		File dir = new File("D:\\springUpload");
		
		System.out.println("존재? : " + dir.exists());
		
		// 지정 폴더 안 파일 목록
		for (File file : dir.listFiles()) {
			System.out.println(file);
		}
		
		File file = new File(dir, "DBCP 설정.txt");
		
		// 삭제 후 확인
		if (file.exists()) {
			file.delete();
		}
		System.out.println("존재? : " + file.exists());
		
		// 다른 파일을 지정
		file = new File(dir, "Account.txt");
		File dest = new File(dir, "이름 변경.txt");
		
		System.out.println("file 존재? : " + file.exists());
		System.out.println("dest 존재? : " + dest.exists());
		
		file.renameTo(dest);
		System.out.println("file 존재? : " + file.exists());
		System.out.println("dest 존재? : " + dest.exists());
	}
	
}
