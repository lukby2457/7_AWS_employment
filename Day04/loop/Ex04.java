package loop;

import java.util.Scanner;

// while 		: (조건식) -> (종속문)
// do ~ while 	: (종속문) -> (조건식)
// 메뉴 등 최초 한번은 실행해야 하는 구문에서는 do ~ while을 사용한다

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("정수 입력(0 : 종료) ");
			n = sc.nextInt();
			
			System.out.println("n = " + n + "\n");
		} while (n != 0);
		
		System.out.println("프로그램 종료~");
		sc.close();
		
	}
}
