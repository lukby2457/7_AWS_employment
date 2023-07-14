package array;

// 변수 : 데이터를 저장하는 공간. 단일 값
// 배열 : '같은 자료형'으로  '메모리상 연속'된 공간. 복수 값

public class Ex01 {
	public static void main(String[] args) {
		// ※ 아래 코드는 꼭 pythontutor에 띄워 보도록 하자!!!
		
		// 변수
		int n = 10;
		
		// 배열					0   1   2   3   4  (= index, 순서번호)
		int[] arr = new int[] {10, 20, 30, 40, 50};
		
		System.out.println("n = " + n);
		System.out.println("arr = " + arr + "\n");
		// 배열은 참조 타입이고, 참조 변수를 그냥 출력하면 '해시코드'가 출력된다
		// '해시코드'는 객체의 고유값으로 사람으로 치면 '주민등록번호'에 해당
		
		System.out.println("arr[0] = " + arr[0]);
		System.out.println("arr[4] = " + arr[4]);
		// 배열에 저장된 데이터를 요소(elements)라고 한다
		// 이 요소를 접근하기 위해선 참조 변수와 index의 조합으로 접근
		
		System.out.println("arr[5] = " + arr[5]);
	}

}
