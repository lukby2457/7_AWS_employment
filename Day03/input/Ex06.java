package input;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// nextLine()은 enter만 구분자로 인식한다
		// 따라서 버퍼를 모두 비우거나, 띄어쓰기를 포함한 문자열 입력에 사용
		Scanner sc = new Scanner(System.in);
		String str1;
		
		System.out.print("띄어쓰기 포함 입력 : ");
		str1 = sc.nextLine();
		
		System.out.println("str1 = " + str1);
		
		sc.close();
		
	}
}
