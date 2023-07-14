package loop;

import java.util.Scanner;

// 불특정 횟수 반복은 무한 반복 형태로 사용하기도 한다

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		while (true) {
			System.out.print("정수 입력 (0 : 종료) ");
			n = sc.nextInt();
			
			System.out.println("n = " + n + "\n");
			
			if (n == 0) {	// if문은  break의 영향을 받지 않는다
				break;		// - 조건을 걸어주기 위함
			}
		}
		
		sc.close();
	}
}
