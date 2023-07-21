package api;

import java.util.Random;

// 의사난수 : 가짜

public class Ex06 {
	public static void main(String[] args) {
		// Random 클래스
		Random ran = new Random();
		
		// 0 ~ 9까지
		for(int i = 0; i < 10; i++) {
			int n = ran.nextInt(10);	// nextInt(n) : 0 ~ (n - 1) 사이의 무작위 정수를 반환
			
			System.out.print(n + " ");
		}
		System.out.println();
		
		// 1 ~ 10까지
		for(int i = 0; i < 10; i++) {
			int n = ran.nextInt(10) + 1;	// (0 ~ 9) + 1
			
			System.out.print(n + " ");
		}
		System.out.println();
		
		// 5 ~ 15까지
		for(int i = 0; i < 10; i++) {
			int n = ran.nextInt(10) + 5;
			
			System.out.print(n + " ");
		}
		System.out.println();
	}
}
