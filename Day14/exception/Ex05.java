package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

// 2. throws 사용시
// - main() 한 곳에서 try - catch로 예외를 모두 처리
// - try - catch문의 개수가 줄어들어 가독성 확보에 도움된다
// - 발생하는 예외가 많을수록 효과적이다

public class Ex05 {
	static void countDown(int sec) throws InterruptedException {
		for(int i = sec; i >= 1; i--) {
			System.out.println(i + "초");
			Thread.sleep(1000);
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
			System.err.println("정수 초 단위로 입력해주세요");
		
		} catch(Exception e) {
			System.err.println("예외 : " + e.getMessage());
		}
		
		sc.close();
	}
}
