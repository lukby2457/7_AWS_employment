package input;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		// 1. 이름, 나이, 신장, 주소를 입력 받을 변수를 선언
		String name;
		int age;
		double height;
		String address;
		
		// 2. 1번의 변수에 데이터를 입력 받는다
		// 단, 주소는 맨 마지막에 입력할 것
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		name = sc.next();
		
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		
		System.out.print("신장 입력 : ");
		height = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.print("주소 입력 : ");
		address = sc.nextLine();
		
		// 3. 아래와 같이 출력
		// 결과)
		// 이름 : 홍길동 (36세)
		// 신장 : 168.7cm
		// 주소 : 부산 광역시 해운대구 센텀
		System.out.printf("\n이름 : %s (%d세)\n", name, age);
		System.out.printf("신장 : %.1fcm\n", height);
		System.out.printf("주소 : %s", address);
		
		sc.close();
		
	}
}
