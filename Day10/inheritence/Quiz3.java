package inheritence;

import java.util.Scanner;

public class Quiz3 {
	static String id = "itbank";
	static String pw = "it";
	
	static String login(String userid, String userpw) {
		boolean sameId = id.equals(userid);
		boolean samePw = pw.equals(userpw);
		
		String result = "로그인 실패";
		
		if(sameId && samePw) {
			result = id + "님 로그인";
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// ID, PW를 문자열로 입력 받아서
		// 아래 정보와 동일하면 로그인 성공을 출력
		// 하나라도 다르면 로그인 실패
		
		Scanner sc = new Scanner(System.in);
//		String id = "itbank";
//		String pw = "it";
		
		System.out.print("ID 입력 : ");
		String userid = sc.next();
		System.out.print("PW 입력 : ");
		String userpw = sc.next();
		
		String result = login(userid, userpw);
		
		System.out.println(result);
		
		sc.close();
		
//		boolean sameId = id.equals(userid);
//		boolean samePw = pw.equals(userpw);
//		
//		if(sameId && samePw) {
//			System.out.println(id + "님 로그인");
//		}
//		else {
//			System.out.println("로그인 실패");
//		}
	}
}
