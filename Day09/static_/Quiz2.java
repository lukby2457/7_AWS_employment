package static_;

import other.Funcs;

public class Quiz2 {
	public static void main(String[] args) {
		// Math와 같은 클래스를 만들어 보자~
		// 아래 코드가 동작하게 클래스를 작성. 단, other패키지에 생성
		
		int ab = Funcs.abs(-5);
		System.out.println("절대값 : " + ab);
		
		int[] arr = new int[] { 60,30,50,70,90 };
		
		System.out.println("배열 요소 : " + Funcs.toString(arr));
		System.out.println("배열의 요소 합계 : " + Funcs.arrTotal(arr));
		System.out.println("배열 요소 최대값 : " + Funcs.arrMax(arr));
		
		System.out.println("7은 소수? " + Funcs.isPrime(7));
	}
}
