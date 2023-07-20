package wrap;

/*
	wrap : 둘러싸다
	wrapper class : 일반 자료형을 객체로 구현한 클래스
	 1. 문자열과 형변환에 사용
	 2. 일반 타입을 객체로 취급해야 하는 경우. ex) 제네릭
	 
	일반 타입		Wrapper Class
	-------------------------
	boolean		Boolean
	char		Character
	byte		Byte	
	short		Short
	int			Integer
	long		Long
	float		Float
	double		Double
 */

public class Ex01 {
	public static void main(String[] args) {
		int n1 = 10;
		Integer n2 = 20;
		Integer n3 = new Integer(30);
		
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
		System.out.println("n3 = " + n3 + "\n");
		
		System.out.println("n1 + n2 = " + (n1 + n2));
		System.out.println("n1 < n3 결과 : " + (n1 < n3) + "\n");
		// Integer가 int를 완전 대체할 수는 있지만 int가 훨씬 가볍다
		// 즉, Integer의 기능이 딱히 필요 없으면 int가 성능상 유리하다
		
		// ※ wrapper는 해당 자료형에 몇몇 기능을 제공한다
		
		System.out.println("65의 2진수 : " + Integer.toBinaryString(65));
		System.out.println("65의 8진수 : " + Integer.toOctalString(65));
		System.out.println("65의 16진수 : " + Integer.toHexString(65));
		
	}
}
