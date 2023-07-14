package input;

import java.util.Scanner;

// 단어나 문장. 즉, 많은 양의 입력을 받으려면 buffer라는 공간이 필요하다
// - 근데, 이런 부분은 자바 후반부에 구문이 등장
// - 그나마 수월하게 입력을 하는 방식이 Scanner이다

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Scanner 클래스 : 특정 자료에서 데이터를 읽어오는 도구
		
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();			// next자료형() : 지정 타입의 자료형으로 데이터를 가져온다
		
		System.out.println("입력한 값은 " + n);
		
		sc.close();
		
	}
}
