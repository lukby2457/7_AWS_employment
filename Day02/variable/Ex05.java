package variable;

/*
	앞서 배운 8가지 자료형은 '기본 자료형'이라고 한다
	그 외 나머지 타입은 모두 '참조 자료형'이라고 한다
	
	- 참조(reference) : 어떠한 대상을 가리키는 것을 의미
	
	자바에서 문자열을 저장 및 처리를 위해서 String이라는 자료형을 제공한다
	이는, 뒤에 배울 '클래스라는 타입'으로 참조 타입에 해당한다
 */

public class Ex05 {
	public static void main(String[] args) {
		int n = 10;				// 기본 타입
		String s = "hello";		// 참조 타입
		
		System.out.println("n = " + n);
		System.out.println("s = " + s);
	}
}
