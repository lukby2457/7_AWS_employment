package generic;

class Point<X, Y> {
	private X x;
	private Y y;
	
	Point(X x, Y y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return String.format("(%s, %s)", x, y);
	}
	
}

public class Ex03 {
	public static void main(String[] args) {
		Point<Integer, Double> p1 = new Point<Integer, Double>(5, 3.14);
		Point<Double, Integer> p2 = new Point<Double, Integer>(6.2, 10);
		// 11버전부터는 new <>(...)만 입력해도 같은 결과를 호출한다
		
		System.out.println("p1 = " + p1);
		System.out.println("p2 = " + p2);
	}
}
