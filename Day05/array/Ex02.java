package array;

public class Ex02 {
	public static void main(String[] args) {
		
		// 배열 생성 방법
		// 1. 초기화한다
		int arr1[] = new int[] { 10,20,30,40,50 };
		
		// 2. 빈공간을 생성한다
		int arr2[] = new int[3];
		
		// 3. 상수로 생성한다 (사용하지 않는 것을 권장)
		int arr3[] = { 11,22,33,44 };
		
		System.out.println("arr1[0] = " + arr1[0]);
		System.out.println("arr2[0] = " + arr2[0]);
		System.out.println("arr3[0] = " + arr3[0] + "\n");
		
		arr1[0] = 100;
		arr3[0] = 111;
		
		System.out.println("arr1[0] = " + arr1[0]);
		System.out.println("arr3[0] = " + arr3[0]);
	}
}
