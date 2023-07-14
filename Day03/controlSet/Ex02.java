package controlSet;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// 보조 조건문 else
		// - if의 보조 구문으로 단독으론 사용 불가능
		// - 위의 조건이 거짓이면 종속문을 수행
		
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		
		if (age >= 20) {
			System.out.print("성인 ");
		}
		else {
			System.out.print("미성년자 ");
		}
		
		System.out.println("입니다");
		sc.close();
		
		// 흐름 : 이전 -> if ~ else -> 다음
		
	}
}
