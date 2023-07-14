package method;

/*
	재귀 (recursive) : 다시 되돌아오다
	
	재귀 함수 : 재귀를 함수로 구현한 것
	- 함수내에서 자신을 호출해서 구현됨
	
 */

public class Ex02 {
	
	static void func(int n) {
		if (n == 0) {
			return;
		}
		
		System.out.print(n + " ");		// 재귀 전 (정방향)
		
		func(n - 1);					// 재귀 발생
				
		System.out.print(n + " ");		// 재귀 후	(역방향)
	}
	
	public static void main(String[] args) {
		
		// 반복 : 편도
		for(int i = 3; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 재귀 : 왕복
		func(3);
		
	}
}
