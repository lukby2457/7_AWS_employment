package other;

public class Child {
	private String name;
	private Ball ball;
	
	public Child(String name) {
		this.name = name;
	}
	
	public void showInfo() {
		String data = (ball == null) ? "x" : ball.getType();
		System.out.printf("%s (공 : %s)\n", name, data);
	}
	
	public void takeBall(Ball ball) {
		this.ball = ball;
		
		String msg = "\n%s(이)가 %s(을)를 얻었다\n";
		System.out.printf(msg, name, ball.getType());
	}
	
	public void throwBall(Child tar) {
		String msg = "\n%s(이)가 %s에게 %s을 던집니다\n";
		System.out.printf(msg, this.name, tar.name, this.ball.getType());
		
		tar.ball = this.ball;
		this.ball = null;
	}
}

// pythontutor에서 참조 화살표를 유심히 살펴 볼 것!
