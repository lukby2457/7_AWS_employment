package loop2;

import java.util.Scanner;

// Quiz의 주석 참고

public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1.
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		for(int i = 0; i < a; i++) {
			for(int j = 0; j <= a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 2.
		for(int i = 0; i < a; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 3.
		for(int i = a; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 강사 풀이
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < a - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		// 4.
		for(int i = 0; i < a; i++) {
			for(int j = a-1; j > i; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 강사 풀이
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < a - 1 - i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 5.
		for(int i = a; i > 0; i--) {
			for(int j = a; j > i; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 강사 풀이
		for(int i = 0; i < a; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < a - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 6.
		int b = 2 * a;
		for(int i = 0; i < b; i+=2) {
			for(int j = 0; j < a - (i/2) - 1; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 강사 풀이
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < a - 1 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i * 2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		// 7.
//		for(int i = a; i > 0; i--) {
//			for(int j = i * 2 - 1; j > 0; j-=2) {
//				System.out.print("*");
//			}
//			for(int j = 0; j <= i; j++) {
//				System.out.print(" ");
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
		
		// 강사 풀이
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < (a - i) * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		sc.close();
	}
}
