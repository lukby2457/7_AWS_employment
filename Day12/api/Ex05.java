package api;

/*
	% 나머지의 용도
	1. 배수 판별
	2. 범위 제한
	3. 숫자 지정 자리 뽑기
 */

public class Ex05 {
	public static void main(String[] args) {
		// Java의 랜덤은 두 가지로 제공된다
		// 1. Math의 random 메서드
		// 2. Random 클래스
		
		for(int i = 0; i < 20; i++) {
			int ran = (int)(Math.random() * 100) % 16 + 5;
			// n % 16 -> 0 ~ 15의 나머지
			// n % 16 + 5 -> (0 ~ 15) + 5
			// 				   즉, 5 ~ 20
			
			System.out.println("ran = " + ran);
		}
		
		// math.random은 권장하지 않음
	}
}
