package generic;

class Po<T> {
	private T dot1, dot2;
	
	Po(T dot1, T dot2){
		this.dot1 = dot1;
		this.dot2 = dot2;
	}
	
	@Override
	public String toString() {
		//return "(" + dot1 + ", " + dot2 + ")";
		return String.format("(%s, %s)", dot1, dot2);
	}
}

public class Quiz {
	public static void main(String[] args) {
		// 아래 코드가 동작하게 클래스를 작성
		Po<Integer> p1 = new Po<Integer>(5, 3);
		Po<Double> p2 = new Po<Double>(3.14, 6.79);
		Po<String> p3 = new Po<String>("Java", "1.8");
		
		System.out.println("p1 = " + p1);
		System.out.println("p2 = " + p2);
		System.out.println("p3 = " + p3);		
	}
}
