package loop;

// 반복문 : 조건에 따라서 코드를 루프

public class Ex01 {
	public static void main(String[] args) {
		// 반복문 while
		// - 조건이 참이면 종속문을 수행
		// - 종속문이 끝나면 다시 조건으로 이동
		
		int i = 1;			// 초기값
		
		while (i <= 5) {	// 조건식
			System.out.println(i + " : Hello World!!!");
			i++;			// 증감식
		}
		
		System.out.println("반복 후 i = " + i);
		
		i = 5;
		
		while (i >= 1) {
			System.out.println(i + " : Hello World!!!");
			i--;
		}
		
		System.out.println("반복 후 i = " + i);
	}
}
