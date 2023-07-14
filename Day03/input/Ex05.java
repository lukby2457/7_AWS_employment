package input;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		// 버퍼(buffer) : 데이터를 모아서 보내기 위한 공간
		// - 입출력 속도 개선에 도움
		// - 버퍼에선  enter와 space가 구분자
		
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		
		System.out.print("두 정수 입력 : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		System.out.printf("n1 = %d, n2 = %d\n", n1, n2);
		
		sc.nextLine();	// 버퍼에서 데이터를 모두 가져온다 (enter만 구분자로 인식, enter까지 buffer에서 다 들고 온다)
		
		
		int n3, n4;
		
		System.out.print("\n다시 두 정수 입력 : ");
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		
		System.out.printf("n3 = %d, n4 = %d\n", n3, n4);
		
		sc.close();
		
		
	}
}
