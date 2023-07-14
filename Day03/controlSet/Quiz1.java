package controlSet;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 정수를 입력 받아서 절대값을 출력
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		
		if (a < 0) {
			a *= -1;
		}
		System.out.println("절대값 : " + a);
		
		// 2. 정수를 입력 받아서 3과 5의 공배수인지 판별
		System.out.print("정수 입력 : ");
		int b = sc.nextInt();
		
		if ((b % 3 == 0) && (b % 5 == 0)) {
			System.out.println("b는 3과 5의 공배수 입니다");
		}
		else {
			System.out.println("b는 3과 5의 공배수가 아닙니다");
		}
		
		// 3. 세 정수를 입력 받아서 가장 큰 수를 출력
		System.out.print("세 정수 입력(스페이스로 구분합니다) : ");
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		
		int max;
		
//		if ((c > d) && (c > e)) {
//			max = c;
//		}
//		else if ((d > c) && (d > e)) {
//			max = d;
//		}
//		else {
//			max = e;
//		}
		
		max = c;
		
		if (max < d) {
			max = d;
		}
		if (max < e) {
			max = e;
		}
		
		System.out.println("세 정수 중 가장 큰 수는 " + max + "입니다");
		
		sc.close();
		
		
	}
}
