package other;

/*
 	인터페이스
 	- 아무것도 구현되지 않은 껍데기 클래스
 	- 자바에서 다중 상속이 가능한 타입
 	- 필드는 public static final 속성이 되고
 	- 메서드는 public abstract가 된다
 */


public interface FlyAble {
	String type = "날개";
	
	void fly();
	// = public abstract void fly();
}
