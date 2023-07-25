package exception;

/*
	throws : 예외를 전가하는 구문
	- try - catch를 너무 많이 작성시 코드의 가독성을 매우 해친다
	- 따라서 try - catch를 최소화 하기 위해서 한 곳으로 예외를 모을 필요가 생김
	- 그게, 예외 전가 구문 throws
	
	※ 사실 try - catch가 쓰기 귀찮을 때 사용하기도 함
 */

public class Ex03 {
	// ※ main에서까지 예외를 전가하면 JVM이 받아서 처리 (※ 예외 발생시 프로그램 종료)
	public static void main(String[] args) throws InterruptedException {
		
		// 1. try - catch 사용시
		// - 저 sleep() 메서드는 예외가 발생할 일이 사실 별로 없다
		// - 근데 예외 처리를 하지 않으면 컴파일 에러가 발생
		for(int i = 5; i >= 1; i--) {
			System.out.println(i + "초");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		System.out.println();
		
		// 2. throws : 현재 메서드에서 발생하는 지정 예외를 모두 호출한 쪽으로 전가한다
		for(int i = 5; i >= 1; i--) {
			System.out.println(i + "초");
			
			Thread.sleep(1000);
		}
		
	}
}
