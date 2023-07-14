package controlSet;

import java.util.Random;
import java.util.Scanner;

/*
	현재 건물에는 엘리베이터 3대가 있습니다
	건물은 지하가 없고 1 ~ 15층까지 있다
	A는 4층에 B는 9층에 C는 12층에 머물러 있다
	사용자에게 현재 층 수를 입력 받아서 가까운 엘리베이터를 호출하라
 */

public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, C, now;
		int disA, disB, disC;
		int min;
		Random rd = new Random();
		A = rd.nextInt(15) + 1;		// rd.nextInt(n) : 0 ~ n-1 사이의 수를 랜덤으로 반환
		B = rd.nextInt(15) + 1;
		C = rd.nextInt(15) + 1;
//		A = 4;
//		B = 9;
//		C = 12;
		
		System.out.printf("엘베) A = %d, B = %d, C = %d\n", A, B, C);
		
		System.out.print("현재 층 수 입력 (1 ~ 15) : ");
		now = sc.nextInt();
		
		// 1. 거리의 절대값 = math.abs(now-A);
		disA = now - A;
		if (disA < 0) {
			disA *= -1;
		}
	
		disB = now - B;
		if (disB < 0) {
			disB *= -1;
		}
		
		disC = now - C;
		if (disC < 0) {
			disC *= -1;
		}
		
		System.out.printf("a의 거리 : %d, b의 거리 : %d, C의 거리 : %d\n", disA, disB, disC);
		
		// 2. 거리의 최솟값
		min = disA;
		if(min > disB) {
			min = disB;
		}
		if(min > disC) {
			min = disC;
		}
		
		// 3. 최솟값에 따른 엘리베이터 이름
		String result = "A엘리베이터";
		
		if(min == disB) {
			result = "B엘리베이터";
		}
		else if(min == disC) {
			result = "C엘리베이터";
		}
		
		System.out.printf("%s가 호출됩니다", result);
		
		sc.close();
	}
}
