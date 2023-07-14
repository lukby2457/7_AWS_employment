package variable;

/*
	자료형(data type) : 자바에서 사용되는 데이터의 타입을 의미
	1. 문자열	: ""(쌍따옴표)로 묶여있는 데이터. 단어나 문장을 표현
	2. 문자	: ''(홉따옴표)로 묶여있는 데이터. 글자 하나를 표현
	3. 정수	: 따옴표가 없는 숫자 데이터. 연산을 위한 데이터
	4. 실수	: 숫자 중 소수점(.)이 있는 데이터
	5. 논리	: 참/거짓을 표현
 */

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("10");	// 문자열
		System.out.println(10);		// 정수
		System.out.println(10.0);	// 실수
		System.out.println();
		
		System.out.println("10" + "20");	// 문자열은 + 연산시 이어 붙는다
		System.out.println(10 + 20);
		System.out.println(10.0 + 3.14);	// 정수/실수는 실제 덧셈이 발생
		System.out.println();
		
		System.out.println('A');	// 문자
		System.out.println("A");	// 문자열
		System.out.println();
		
		System.out.println(true);	// 논리
		System.out.println("true");	// 문자열
		
	}
}
