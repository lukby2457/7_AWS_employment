package exception;

import java.util.Scanner;

/*
	예외 클래스는 직접 만들어서 사용할 수도 있다
	단, Java에 이미 존재하는 예외 클래스가 많아서 잘 만들어 사용하지 않음
 */

class myException extends Exception {
	private static final long serialVersionUID = 123456L;
	
	public myException(String msg) {
		super(msg);
	}
	
}

public class Ex06 {
	// throws : 예외를 전가하겠다
	// throw : 예외를 발생시키겠다
	
	static int total(int n) throws myException {
		if(n <= 0) {
			throw new myException("음수 입니다");
		}
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		try {
			System.out.print("양수 입력 : ");
			n = sc.nextInt();
			
			int sum = total(n);
			
			System.out.println("1 ~ " + n + "까지 합 : " + sum);
			
		} catch(myException e) {
			System.err.println("예외 : " + e.getMessage());
			
		}
		
		sc.close();
	}
}	
