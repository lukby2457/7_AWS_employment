package jdbc;

import model.DAO;

public class Ex01 {
	public static void main(String[] args) {
		// DAO 클래스를 작성 후 접속 테스트
		// 단, 테스트 구문으로 DB에서 현재 시간을 받아서 변환
		DAO dao = new DAO();
		System.out.println(dao.test());
	}
}
