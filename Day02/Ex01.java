// package가 지정되지 않은 클래스는 default 패키지에 생성이 된다
// 1. 실행에 차이는 없다
// 2. 단, 외부에서 import가 불가능해 불러서 사용할 수 없다

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("패키지가 없는 클래스 입니다");
		System.out.println("실행은 잘 됩니다");
	}
}
