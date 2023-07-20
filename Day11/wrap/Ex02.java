package wrap;

public class Ex02 {
	public static void main(String[] args) {
		// 문자열과 형변환
		// 1. 문자열 -> 정수, 실수
		String str1 = "123";
		String str2 = "3.141592";
		
		System.out.println(str1 + str2);
		
		// int n1 = (int) str1;		일반 타입과 클래스 간엔 형변환 불가능
		int n1 = Integer.parseInt(str1);
		double d1 = Double.parseDouble(str2);
		
		System.out.println(n1 + d1 + "\n");
		
		// 2. 정수, 실수 -> 문자열
		str1 = Integer.toString(10);
		str2 = Double.toString(6.1234);
		
		System.out.println(str1 + str2);
		
		// ※ 자동 형변환을 활용
		str1 = 15 + "";
		str2 = 13.14 + "";
		
		System.out.println(str1 + str2);
		System.out.println();
		
		str1 = "" + 10 + 20;
		str2 = 10 + 20 + "";
		
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
	}
}
