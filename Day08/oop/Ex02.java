package oop;

class Ball {
	String type;
	
	Ball(String type) {
		this.type = type;
	}
}

class Child {
	String name;
	Ball ball;
	
	Child(String name) {
		this.name = name;
	}
	
	void showInfo() {
		String type = (ball == null) ? "없음" : ball.type;	// 대상이 없는데 출력하라 하면 nullpointerror 발생
		
		System.out.printf("%s (공 : %s)\n", name, type);
	}
	
	void takeBall(Ball ball) {
		this.ball = ball;
		
		System.out.printf("%s(이)가 %s(을)를 얻었다\n", name, ball.type);
	}
	
	void throwBall(Child tar) {
		tar.ball = this.ball; 
		
		System.out.printf("%s(이)가 %s에게 %s(을)를 던짐\n", this.name, tar.name, this.ball.type);
		
		this.ball = null;
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Child minsu = new Child("민수");
		Child junho = new Child("준호");
		
		minsu.showInfo();
		junho.showInfo();
		
		Ball base = new Ball("야구공");
		
		minsu.takeBall(base);
		
		minsu.showInfo();
		junho.showInfo();
		
		minsu.throwBall(junho);		// 민수가 준호에게 야구공을 던짐
		
		minsu.showInfo();
		junho.showInfo();
	}
}
