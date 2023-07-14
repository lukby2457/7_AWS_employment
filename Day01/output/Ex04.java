package output;

public class Ex04 {
	public static void main(String[] args) {
		// escape sequence : 이스케이프 시퀀스
		// - 문자열 내에서 특수한 형태로 사용되는 문자들
		// - 문자열 : 쌍따옴표("")로 묶인 데이터. 단어나 문장을 표현하는 데이터 타입
		
		System.out.println("Hello\nWorld!!!"); 			     // \n : new line. 개행
		System.out.println("안녕하세요 \t\t 홍길동 입니다"); 	     // \t : tab. 들여쓰기
		
		System.out.println("저희 JDK 버전은 '1.8'입니다");
		System.out.println("저희 JDK 버전은 \"1.8\"입니다"); 		 // \" : 문자열 묶는 기능을 제거
		
		System.out.println("공유 폴더 : \\\\192.168.113.12");    // \\ : 이스케이프 기능을 제거
	}
}
