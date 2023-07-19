package inheritence;

// Object 클래스
// - Java의 최상위 클래스
// - Java의 모든 클래스는 예외 없이 Object를 상속 받는다

import java.lang.Object;	// 자동으로 import된다

class Po extends Object {	// Object는 작성하지 않아도 자동으로 상속된다
	private int x, y;
	
	Po(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {		// obj로 업캐스팅
		if (this == obj)					// p1 == p2 비교
			return true;
		if (obj == null)					// p2가 null인가
			return false;
		if (getClass() != obj.getClass())	// p1과 p2는 같은 클래스인가
			return false;
		Po other = (Po) obj;				// obj에서 자식으로 다운캐스팅
		if (x != other.x)					// p1.x == p2.x
			return false;
		if (y != other.y)					// p1.y == p2.y
			return false;
		return true;
	}
}

public class Ex05 {
	public static void main(String[] args) {
		Po p1 = new Po(3, 2);
		Po p2 = new Po(3, 2);
		Po p3 = p1;
		
		System.out.println("p1 = " + p1);
		System.out.println("p1 = " + p1.toString());
		// 출력에 참조변수를 두면 toString()을 호출하게 되어있다
		// showInfo()같은 것을 오버라이딩으로 처리해서 간결하게 출력할 수 있다
		
		System.out.println("p1 = " + p1.hashCode() + "\n");
		// 해시코드를 반환
//		System.out.println("p1 = " + Integer.toHexString(p1.hashCode()));	10진수를 16진수로 변환
		
		System.out.println("p1 = " + p1);
		System.out.println("p2 = " + p2);
		System.out.println("p3 = " + p3 + "\n");
		
		System.out.printf("p1 = %x\n", p1.hashCode());
		System.out.printf("p2 = %x\n", p2.hashCode());
		System.out.printf("p3 = %x\n\n", p3.hashCode());
		// 해시코드가 다르면 안의 값이 같아도 다른 것으로 인식한다
		
		System.out.println("p1 == p2 결과 : " + (p1 == p2));
		System.out.println("p1 == p3 결과 : " + (p1 == p3) + "\n");
		// 참조변수의 비교는 같은 객체(= 인스턴스)를 가리키는가 비교
		// 필드 비교 x
		
		System.out.println("p1.equals(p2) 결과 : " + p1.equals(p2));
		System.out.println("p1.equals(p2) 결과 : " + p1.equals(p3));
		// equals() 그냥 사용 = '=='와 동일한 효과
		// 오버라이드가 가능하기 때문에 원하는 필드를 비교하게 변경 가능
	}
}
