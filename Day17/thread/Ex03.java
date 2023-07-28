package thread;

public class Ex03 {
	public static void main(String[] args) {
		// Runnable은 함수형 인터페이스
		// 즉, run()을 람다식으로 바로 구현 가능
		
		Runnable rn = () -> {
			for(int i = 5; i >= 1; i--) {
				System.out.println(i + "초");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
			}
			System.out.println();
		};
		
		Thread th1 = new Thread(rn);
		Thread th2 = new Thread(() -> {
			for(int i = 10; i >= 1; i--) {
				System.err.println(i + "번");
				
				try {
				Thread.sleep(500);
				} catch (InterruptedException e) {}
			}
		}) ;
		
		th1.start();
		th2.start();
		
		System.out.println("main 끝");
	}
}
