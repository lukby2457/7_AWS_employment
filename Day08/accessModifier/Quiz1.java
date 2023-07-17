package accessModifier;

import other.Ball;
import other.Child;

public class Quiz1 {
	public static void main(String[] args) {
		// 아래 클래스를 other패키지에 작성
		// 필드는 모두 private 처리한다
		
		Child minsu = new Child("민수");
		Child jinho = new Child("진호");
		
		minsu.showInfo();	// 민수 (공 : x)
		jinho.showInfo();	// 진호 (공 : x)
		
		Ball base = new Ball("야구공");
		
		minsu.takeBall(base);
		
		minsu.showInfo();	// 민수 (공 : 야구공)
		jinho.showInfo();	// 진호 (공 : x)
		
		minsu.throwBall(jinho);
		
		minsu.showInfo();
		jinho.showInfo();
	}
}
