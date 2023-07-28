package thread;

/*
	Thread는 클래스이다
	따라서, 상속 받으면 다른 클래스의 상속이 불가능 하다는 문제가 발생
	이를 해결하기 위해서 Runnable이라는 인터페이스가 있다
	
	※ Runnable는 함수형 인터페이스
	- 람다식으로 구현이 가능하다
 */

class Test2 implements Runnable {

	@Override
	public void run() {
		for(int i = 5; i >= 1; i--) {
			System.out.println(i + "초");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		System.out.println();
	}
	
}

public class Ex02 {
	public static void main(String[] args) {
		Test2 test = new Test2();
		
		test.run();
		test.run();
		// - 그냥 run()을 호출한 것
		// - 새 쓰레드는 생성되지 않음
		
		Thread th1 = new Thread(test);
		Thread th2 = new Thread(test);
		// Runnable을 구현한 객체를 Thread 생성자에 전달
		
		th1.start();
		th2.start();
		// Thread 객체로 새 쓰레드를 생성
		
		System.out.println("main은 끝났어요");
		
	}
}
