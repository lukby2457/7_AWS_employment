package loop2;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 (홀수 권장) : ");
		int n = sc.nextInt();
		System.out.println();
		
		// 1. ㅁ 찍기
		for(int i = 0; i < n; i++) {
			if(i == 0 || i == n-1) {
				for(int j = 0; j < n; j++) {
					System.out.print("*");
				}
			}
			else {
				for(int j = 0; j < n; j++) {
					if(j == 0 || j == n-1) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 강사 풀이
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if (i == 0 || i == (n-1) || j == 0 || j == (n-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		// 2. + 찍기
		for(int i = 0; i < n; i++) {
			if(i == (n/2)) {
				for(int j = 0; j < n; j++) {
					System.out.print("*");
				}
			}
			else {
				for(int j = 0; j < n; j++) {
					if(j == (n/2)) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 강사 풀이
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i == (n/2) || j == (n/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		// 3. x 찍기
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(j == n - 1 - i || j == i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 강사 풀이
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i == j || i + j == n - 1) {
					System.out.print("*");					
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		// 4. z 찍기
		for(int i = 0; i < n; i++) {
			if(i == 0 || i == n-1) {
				for (int j = 0; j < n; j++) {
					System.out.print("*");
				}
			}
			else {
				for(int j = 0; j < n; j++) {
					System.out.print(" ");
					if(i == n - j - 2) {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 강사 풀이
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i == 0 || i == n-1 || i + j == n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		sc.close();
	}
}	
