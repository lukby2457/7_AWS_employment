package inheritence;

// String은 java.lang 안에 있는 클래스

public class Ex06 {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3 + "\n");
		
		System.out.printf("str1 = %x\n", str1.hashCode());
		System.out.printf("str2 = %x\n", str2.hashCode());
		System.out.printf("str3 = %x\n\n", str3.hashCode());
		// 문자열이 같으면 같은 해시값. 즉, 동일한 데이터로 취급
		
		System.out.println("str1 == str2 결과 : " + (str1 == str2));
		System.out.println("str1 == str3 결과 : " + (str1 == str3) + "\n");
		
		System.out.println("str1.equals(str2) 결과 : " + str1.equals(str2));
		System.out.println("str1.equals(str3) 결과 : " + str1.equals(str3));
		// 문자열이 같은지 비교하고 싶을땐 .equals를 사용하면 된다
	}
}
