package inheritence;

import java.util.Scanner;

public class YesterdayQuiz {
	static String[] ids = new String[] { "itbank", "root", "user" };
	static String[] pws = new String[] { "it", 		"qwe", "1234" };
	
	static String login(String userid, String userpw) {
		for(int i = 0; i < ids.length; i++) {
			boolean sameId = ids[i].equals(userid);
			boolean samePw = pws[i].equals(userpw);
			
			if(sameId && samePw) {
				return ids[i] + "님 로그인";
			}			
		}
		
		return "로그인 실패";
	}
	
	public static void main(String[] args) {
		// 사용자에게 ID/PW를 입력 받아서 위에 생성해둔 계정과 비교
		// 일치하는 계정이 있으면 로그인 성공, 없으면 실패
		// ※ 같은 index의 데이터가 한 쌍의 계정 정보
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ID 입력 : ");
		String userid = sc.next();
		System.out.print("PW 입력 : ");
		String userpw = sc.next();
		sc.close();
		
		userid = login(userid, userpw);
		
		System.out.println("결과 : " + userid);
	}
}	
