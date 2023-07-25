package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

// 1. throws 없이 사용시
// - countDown(), main()에서 try - catch가 각각 한번씩 발생
// - 즉, 코드의 가독성을 해치게 된다

public class Ex04 {
	static void countDown(int sec) {
		for(int i = sec; i >= 1; i--) {
			System.out.println(i + "초");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sec;
		
		try {
			System.out.print("몇 초? ");
			sec = sc.nextInt();
			
			countDown(sec);
			
		} catch(InputMismatchException e) {
			System.err.println("정수 초 단위로 입력해야 합니다");
		}
		
		
		sc.close();
	}
}
