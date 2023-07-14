package loop;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 정수를 입력 받아서 1 ~ n까지 일렬로 출력
		// ex) 입력 : 5 -> 출력 : 1 2 3 4 5
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		int i = 1;
		
		while (i <= a) {
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println();
		
		// 2. 1번을 역순으로
		// ex) 입력 : 3 -> 출력 : 3 2 1
		System.out.print("정수 입력 : ");
		int b = sc.nextInt();
		
		while (b > 0) {
			System.out.print(b + " ");
			b--;
		}
		
		System.out.println();
		
		// 3. 정수를 입력 받아서 1 ~ n까지의 합계 (= 누적합)
		System.out.print("정수 입력 : ");
		int c = sc.nextInt();
		int sum = 0, k = 1;
		
		while (k <= c) {
			sum += k;
			k++;
		}
		System.out.println("누적합 : " + sum);
		
		// 4. 정수를 입력 받아서 1 ~ n까지의 곱 (= 누적곱)
		System.out.print("정수 입력 : ");
		int d = sc.nextInt();
		int l = 1;
		long mul = 1L;
		
		while (l <= d) {
			mul *= l;
			l++;
		}
		System.out.println("누적곱 : " + mul);

		// 5. 정수를 입력 받아서 거꾸로 출력
		// ex) 입력 : 123 -> 출력 : 321
		System.out.print("정수 입력 : ");
		int e = sc.nextInt();
		int rev = 0;
		
		while (e != 0) {
			rev = rev * 10 + e % 10;
			e /= 10;
		}
		System.out.println("rev = " + rev);
		
		sc.close();
	}
}
