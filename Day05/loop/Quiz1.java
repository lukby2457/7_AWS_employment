package loop;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// 아래 문제들은  for문으로 해결한다
		Scanner sc = new Scanner(System.in);
		// 1. 정수를 입력 받아서 1 ~ n 까지 일렬로 출력
		// ex) 입력 : 6 -> 출력 : 1 2 3 4 5 6
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		for(int i = 1; i <= a; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// 2. 정수를 입력 받아서 약수를 출력
		// ex) 입력 : 6 -> 출력 : 1 2 3 6
		System.out.print("정수 입력 : ");
		int b = sc.nextInt();
		for(int i = 1; i <= b; i++) {
			if(b % i == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		// 3. 정수를 입력 받아서 소수인지 판별
		// ex) 입력 : 6 -> 출력 : 소수 아님
		System.out.print("정수 입력 : ");
		int c = sc.nextInt();
		int count = 0;
		
		for(int i = 1; i <= b; i++) {
			if(c % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("소수");
		}
		else {
			System.out.println("소수 아님");
		}
		
		
		sc.close();
	}
}
