package api;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// Unix 타임 : 1970년 부터 1초씩 세고 있는 시간
		long time = System.currentTimeMillis();
		
		System.out.println("현재 시간 : " + time);									// 밀리초 (1/1000초)
		System.out.println("현재 시간 : " + time / 1000);							// 초
		System.out.println("현재 시간 : " + time / 1000 / 60);						// 분
		System.out.println("현재 시간 : " + time / 1000 / 60 / 60);					// 시
		System.out.println("현재 시간 : " + time / 1000.0 / 60 / 60 / 24);			// 일
		System.out.println("현재 시간 : " + time / 1000.0 / 60 / 60 / 24 / 365);	// 년
		System.out.println();
		
		// ※ 시작 시간과 종료 시간의 차이는 소요 시간이다
		// 즉, 소요 시간 = 종료 - 시작
		Scanner sc = new Scanner(System.in);
		String word;
		
		long start = System.currentTimeMillis();
		
		System.out.println("Hello World!!! Welcome to Java~");
		word = sc.nextLine();
		
		long end = System.currentTimeMillis();
		
		System.out.printf("총 소요 시간 : %f초\n", (end - start) / 1000.0);
		
		sc.close();
	}
}
