package abstract_;

import other.Figure;

class Triangle extends Figure {
	@Override
	public void draw() {
		System.out.println("삼각형을 그린다");
	}	
}

class Square extends Figure {
	@Override
	public void draw() {
		System.out.println("사각형을 그린다");
	}	
}

class Circle extends Figure {
	@Override
	public void draw() {
		System.out.println("원을 그린다");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		// Figure fig = new Figure();
		// - 추상 클래스는 인스턴스 생성 불가
		
		Triangle tri = new Triangle();
		Square squ = new Square();
		Circle cir = new Circle();
		
		tri.show();
		tri.draw();
		System.out.println();
		
		Figure[] figs = new Figure[] {tri, squ, cir};	
		// 추상 클래스는 실체화 (= 인스턴스)가 불가능하지만
		// 개념은 존재한다. 따라서 참조변수는 사용 가능
		
		for(int i = 0; i < figs.length; i++) {
			figs[i].draw();
		}
		
	}
}	
