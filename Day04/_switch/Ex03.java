package _switch;

import java.util.Scanner;

// Java의 Switch은 문자열을 사용할 수 있다

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String menu;
		
		System.out.println("----------- 메뉴 -----------");
		System.out.println("\t 1. 짜장면");
		System.out.println("\t 2. 짬뽕");
		System.out.println("\t 3. 돈까스");
		System.out.println("\t 4. 볶음밥");
		
		System.out.print(">>> ");
		menu = sc.next();
		
		switch(menu) {
		case "1": case "짜장면":
			System.out.println("짜장면 주문이요~");
			break;
		case "2": case "짬뽕" :
			System.out.println("짬뽕 주문이요~");
			break;
		case "3": case "돈까스":
			System.out.println("돈까스 주문이요~");
			break;
		case "4": case "볶음밥":
			System.out.println("볶음밥 주문이요~");
			break;
		default:
			System.out.println("존재하지 않는 메뉴 이름이거나 메뉴 번호입니다");
		}
		
		sc.close();
		
	}
}	
