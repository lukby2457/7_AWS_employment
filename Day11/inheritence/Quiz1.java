package inheritence;

import java.util.Scanner;

class User {
	private String userid, userpw, nick;
	
	User(String userid, String userpw) {
		this.userid = userid;
		this.userpw = userpw;		
	}
	
	User(String userid, String userpw, String nick) {
		this(userid, userpw);		// this() : 다른 생성자 호출
		this.nick = nick;			// this.멤버 : 필드나 메서드를 호출
	}

	public String getUserid() {
		return userid;
	}

	public String getUserpw() {
		return userpw;
	}

	public String getNick() {
		return nick;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userid == null) ? 0 : userid.hashCode());
		result = prime * result + ((userpw == null) ? 0 : userpw.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (userid == null) {
			if (other.userid != null)
				return false;
		} else if (!userid.equals(other.userid))
			return false;
		if (userpw == null) {
			if (other.userpw != null)
				return false;
		} else if (!userpw.equals(other.userpw))
			return false;
		return true;
	}
	
	
	
//	public String toString() {
//		return userid + " : " + userpw + " : " + nick;
//	}	디버깅용
}

public class Quiz1 {
	static User[] dbs = new User[] {
			new User("itbank", "it", "아뱅"),		// ID, PW, Nick
			new User("root", "qwe", "관리자"),
			new User("user", "1234", "유저"),
	};
	
//	static String login(User user) {
//		for(int i = 0; i < dbs.length; i++) {
//			boolean sameId = (dbs[i].getUserid()).equals(user.getUserid());
//			boolean samePw = (dbs[i].getUserpw()).equals(user.getUserpw());
//			
//			if(sameId && samePw) {
//				return dbs[i].getNick() + "님 로그인";
//			}
//		}
//		return "로그인 실패";
//	}
	
	static User login(User user) {
		for(int i = 0; i < dbs.length; i++) {
			if(dbs[i].equals(user)) {
				return dbs[i];
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		// 이번엔 계정 정보를 클래스로 구현해서 로그인을 구현
		Scanner sc = new Scanner(System.in);
		String userid, userpw, nick;
		
		System.out.print("ID 입력 : ");
		userid = sc.next();
		System.out.print("PW 입력 : ");
		userpw = sc.next();
		sc.close();
		
		User user = new User(userid, userpw);
		
//		System.out.println(user);	디버깅용
		
//		nick = login(user);
//		
//		System.out.println(nick);
		
		user = login(user);
		
		String msg = "로그인 실패";
		if(user != null) {
			msg = user.getNick() + "님 로그인";
		}
		System.out.println(msg);
	}
	
}
