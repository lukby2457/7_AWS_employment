package controlSet;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// else if는 사실 else 안의 if
		
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		
		if (age >= 20) {
			System.out.print("성인 ");
		}
		else {
			if (age >= 17) {
				System.out.print("고등학생 ");
			}
			else {
				if (age >= 14) {
					System.out.print("중학생 ");
				}
				else {
					System.out.print("초등학생 이하");
				}
			}
		}
		
		System.out.println("입니다");
		sc.close();
	}
}
