package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		// 정수를 입력 받아서 화면에 그대로 출력
		// 단, 정수가 아니면 사용자에게 다시 입력 받도록 한다
		// 재입력시 정수가 맞으면 출력 후 종료
		
		// ※ Buffer가 뭐였는지 생각해 보세요
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		while(true) {
			try {
				System.out.print("정수 입력 : ");
				n = sc.nextInt();
				
				System.out.println("n = " + n);
				break;
			
			} catch(InputMismatchException e) {
				System.err.println("정수를 입력해 주세요\n");
				sc.nextLine();
			}
		}
		
		sc.close();
	}
}
