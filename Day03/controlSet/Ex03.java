package controlSet;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// if ~ else VS if ~ if
		
		// if else		if if
		// o  x			o  o
		// x  o			o  x
		//				x  o
		//				x  x
		
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		
		if (age >= 20) {
			System.out.print("성인 ");
		}
		if (age < 20) {
			System.out.print("미성년자 ");
		}
		
		System.out.println("입니다");
		sc.close();
		
		// 흐름 : 이전 -> if_1 -> if_2 -> 다음
		
	}
}
