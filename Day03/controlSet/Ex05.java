package controlSet;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		// 중첩 조건문
		// - 조건문 안에 조건문을 구성하는 방식
		// - 상세한 조건 처리가 필요할 때 사용한다
		// - 단, 남용시 가독성을 해치므로 주의한다
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("정수 입력 : ");
		n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("짝수");
			
			if (n % 3 == 0) {
				System.out.println("짝수이며 3의 배수");
			}
			else {
				System.out.println("짝수이지만 3의 배수가 아님");
			}
		}
		else {
			System.out.println("홀수");
			
			if (n % 3 == 0) {
				System.out.println("홀수이며 3의 배수");
			}
			else {
				System.out.println("홀수이지만 3의 배수가 아님");
			}
		}
		
		sc.close();
		
	}
}
