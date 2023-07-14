package variable;

/*
	형변환 : 데이터 타입을 변환하는 작업
	1. 자동 형변환 : 서로 다른 타입을 연산시 발생
	2. 강제 형변환 : 자료형을 직접 명시해 변환
 */

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("10" + "20");
		System.out.println("10" + 20);
		System.out.println();
		// 서로 다른 타입은 원래 연산이 불가능
		// 그럼, 서로 타입을 맞추면 연산되겠네! (= 자동 형변환)
		// 크기가 작거나 표현 범위가 작은 쪽이 큰 쪽으로 변환된다
		
		System.out.println(10 + 3.14);
		// 실수와 정수는 타입이 다른 자료형
		// 그래서 원래 연산이 불가능하다
		// 이때, 자동 형변환이 발생해서 10 -> 10.0으로 바뀌고 연산
		
		
	}
}
