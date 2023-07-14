package loop;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// 연습
		// 1. 아래 구문을 반복으로 줄여보세요
		int i = 1;
		
		while (i < 10) {
			System.out.printf("%d * %d = %d\n", 2, i, 2 * i);
			i++;
		}
		
		System.out.println();
		
		// 2. 1번을 입력문으로 전환 후 입력한 구구단을 출력
		Scanner sc = new Scanner(System.in);
		i = 1;
		System.out.print("단수를 입력하세요 : ");
		int t = sc.nextInt();
		
		while (i < 10) {
			System.out.printf("%d * %d = %d\n", t, i, t * i);
			i++;
		}
		
		sc.close();
		
		System.out.println();

		// 3. 역순으로도 출력
		i -= 1;
		
		while (i > 0) {
			System.out.printf("%d * %d = %d\n", t, i, t * i);
			i--;
		}
		
	}
}
