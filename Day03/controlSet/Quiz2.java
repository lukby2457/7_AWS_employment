package controlSet;

import java.util.Scanner;

/*
	현재 건물에는 엘리베이터 2대가 있습니다
	건물은 지하가 없고 1 ~ 15층까지 있다
	A는 4층에 B는 9층에 머물러 있다
	사용자에게 현재 층 수를 입력 받아서 가까운 엘리베이터를 호출하라
 */

public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, now;
		int disA, disB;
		A = 4;
		B = 9;
		
		System.out.printf("엘베) A = %d, B = %d\n", A, B);
		
		System.out.print("현재 층 수 입력 (1 ~ 15) : ");
		now = sc.nextInt();
		
		disA = now - A;
		if (disA < 0) {
			disA *= -1;
		}
	
		disB = now - B;
		if (disB < 0) {
			disB *= -1;
		}
		
		System.out.printf("a의 거리 : %d, b의 거리 : %d\n", disA, disB);
		
		if (disA < disB) {
			System.out.println("A엘리베이터가 호출됩니다");
		}
		else {
			System.out.println("B엘리베이터가 호출됩니다");
		}
		
		sc.close();
	}
}
