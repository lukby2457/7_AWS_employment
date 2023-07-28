package thread;

/*
	Thread : 쓰레드
	- 프로그램 내의 실행 흐름 단위
	- 기본적으로 main에서 한개의 쓰레드가 생성되고 코드가 실행된다
	- 이 쓰레드를 여러개를 생성해서 프로그램을 작성할 수 있다
	- 이를, 멀티 쓰레딩이라고 한다
 */

// Thread 클래스를 상속 받아서 구현 가능
class Test extends Thread {

	@Override
	public void run() {		// run() : 새 쓰레드를 생성해서 실행할 코드를 작성
		for(int i = 5; i >= 1; i--) {
			System.out.println(i + "초");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			
		}
		System.out.println();
	}
	
}

public class Ex01 {
	public static void main(String[] args) throws InterruptedException {
		
		Test t1 = new Test();
		Test t2 = new Test();
		
		t1.run();		// run()을 그냥 호출하면 새 쓰레드가 생성되지 않음
		t2.run();
		
		t1.start();		// start()는 run()을 호출하게 되어있다
		
		t2.start();		// - 이때, 새 쓰레드를 만들면서 run() 실행
		
		for(int i = 10; i >= 1; i--) {
			System.err.println(i + "Hello");
			Thread.sleep(1000);
		}
	}
}
