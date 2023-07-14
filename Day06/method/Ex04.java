package method;

public class Ex04 {
	static void func(int n, int[] array) {
		n++;
		array[0]++;
	}
	
	public static void main(String[] args) {
		// 일반 타입은 복사(=)시 실제 데이터가 복사되고
		// 참조 타입은 복사시 가리키는 방향이 같아진다
		
		int n = 10;
		int[] arr = new int[] { 10 };
		
		func(n, arr);
		System.out.println("n = " + n);
		System.out.println("arr[0] = " + arr[0]);
		
	}
}
