package variable;

/*
	변수 (variable)
	- 데이터를 저장하는 공간
	- 변하는 수
 */

public class Ex03 {
	public static void main(String[] args) {
		int n = 10 + 2;					// 변수의 선언 : 변수를 생성하고 데이터를 저장
		
		System.out.println("n");
		System.out.println(n);			// 변수의 호출 : 앞서 만들어진 변수의 데이터를 가져오는 것
		System.out.println();
		
		System.out.println("n = " + n); // 변수에 저장된 값은 여러변 '재사용' 가능하다
		
		n = 30;		// 변수는 데이터를 변경해서 저장 가능하고
					// 이미 만들어진 변수는 이름만 작성하면 된다
		
		System.out.println("n = " + n);
		
	}
}
