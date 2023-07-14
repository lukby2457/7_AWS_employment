package variable;

public class Quiz {
	public static void main(String[] args) {
		// 1. 이름, 나이, 신장, 성별, 주소를 저장할 변수를 선언
		// 단, 성별은 char로 선언할 것
		String name;
		int age;
		double height;
		char sexual;
		String add;
		
		// 2. 1번의 변수에 값을 채운다
		name = "홍길동";
		age = 23;
		height = 167.9;
		sexual = '남';
		add = "부산 광역시 해운대구 센텀로";
		
		// 3. 채운 변수를 아래와 같이 추렭
		// 결과)
		// 이름 : 홍길동 (23세, 남)
		// 신장 : 167.9cm
		// 주소 : 부산 광역시 해운대구 센텀로
		System.out.println("이름 : " + name + " (" + age + "세, " + sexual + ")");
		System.out.println("신장 : " + height + "cm");
		System.out.println("주소 : " + add);
		
		System.out.println();
		
		// printf() : format(형태)를 잡아 놓고 데이터를 채우는 방식
		// %s : String, 문자열 자리
		// %c : Character, 문자 자리
		// %d : Decimal, 10진 정수 자리
		// %f : Float, 실수 자리
		System.out.printf("이름 : %s (%d세, %c)\n", name, age, sexual);
		System.out.printf("신장 : %fcm\n", height);		// %f는 기본 소수점 6자리를 출력
		System.out.printf("신장 : %.1fcm\n", height);		//%.nf라고 쓰면 n자리 만큼 출력
		System.out.printf("주소 : %s\n", add);
	}
}
