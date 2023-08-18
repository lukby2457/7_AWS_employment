package jdbc;

import dao.DAO;

public class Ex02 {
	public static void main(String[] args) {
		// 5. DB에서 작성한 사용자 정의 함수 abso(), rev()를 호출해서 화면에 출력
		DAO dao = new DAO();
		
		System.out.println(dao.abs(19));
		System.out.println(dao.abso(-15));
		System.out.println(dao.rev(526));
		System.out.println(dao.reve(625));
	}
}
