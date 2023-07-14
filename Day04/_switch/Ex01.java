package _switch;

import java.util.Scanner;

/*
	switch ~ case
	- 조건이 아닌 값으로 코드를 분기한다
	- 값에 따라 실행할 구문이 선택되기 때문에'선택문'이라고도 한다
	- 주로 메뉴 작성에 자주 사용된다
	
	※ switch문은 전부 if로 구현 가능 (반대는 불가능 = 범위 조건 구현 불가능)
	if (menu >= 10) {}
 */

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu;
		
		System.out.print("메뉴 (1~3) ");
		menu = sc.nextInt();
		
		switch(menu) {	// switch의 값으로는 정수와 문자열만 가능
		case 1:
			System.out.println("1번을 선택");
			break;		// 제어문을 '즉시' 종료
		case 2:
			System.out.println("2번을 선택");
			break;
		case 3:
			System.out.println("3번을 선택");
			break;
		default:		// default는 가장 밑에 적는 것을 권장
			System.out.println("부적합한 메뉴 입니다~");
		}
		
		System.out.println("\n프로그램 종료~");
		sc.close();
	}
}
