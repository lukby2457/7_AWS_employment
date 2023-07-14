package array;

public class Ex03 {
	public static void main(String[] args) {
		// 배열의 index는 0 ~ n 순으로 순차적으로 증가
		// - 따라서 반복문과 궁합이 좋다
		
		int arr[] = new int[] { 10,20,30,40,50 };
		
		System.out.println("arr 크기 : " + arr.length);
		// - 자바의 배열은 요소의 개수(= 크기)를 가진 변수가 있다
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
