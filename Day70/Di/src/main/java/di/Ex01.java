package di;

import beans.Battery;
import beans.Toy;

// Spring을 활용하지 않은 코드
public class Ex01 {
	public static void main(String[] args) {
		Battery bat = new Battery();
		
		Toy t1 = new Toy();		// 객체 하나 생성
		
		t1.setBat(bat);			// 장난감에 배터리를 주입 (= Injection)
		t1.run();
		
		Toy t2 = new Toy();		// 두번째 객체 생성
		Toy t3 = t1;			// t1과 동일한 객체를 가리킴
		
		t2.run();				// 배터리가 없는 장난감은 동작할 수 없다 (= 의존성 Dependency)
		t3.run();
		
		// 해시코드가 같다면 동일한 데이터를 참조하고 있다는 의미
		// 즉, t1과 t3는 배터리가 부착된 장난감을 참조하고 t2는 배터리가 없는 장난감을 참조
		System.out.println("\nt1 = " + t1);
		System.out.println("t2 = " + t2);
		System.out.println("t3 = " + t3);
	}
}
