package poly;

// 다형성 : 다양한 형태를 가진다는 의미

// 다형성을 구현하기 위한 조건
// 1. 상속
// 2. 오버라이드

class Figure{
	void draw() {
		System.out.println("도형을 그린다");
	}
}

class Triangle extends Figure {
	@Override
	void draw() {
		System.out.println("삼각형을 그린다");
	}
}

class Square extends Figure {
	@Override
	void draw() {
		System.out.println("사각형을 그린다");
	}
}

class Circle extends Figure {
	@Override
	void draw() {
		System.out.println("원을 그린다");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Figure fig = new Figure();
		Triangle tri = new Triangle();
		Square squ = new Square();
		Circle cir = new Circle();
		
		// 업캐스팅으로 자식 객체를 묶어준다
		Figure[] figs = new Figure[] { fig, tri, squ, cir};
		
		for(int i = 0; i < figs.length; i++) {
			figs[i].draw();			// 업캐스팅이 되더라도 자식에서 
									// 오버라이드 된 메서드가 실행된다
		}	
		
	}
}
