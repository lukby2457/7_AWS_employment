package jdbc;

import model.DAO;

/*
	DAO : Data Access Object
	- DB의 정보를 가지고 접근할 객체
	- Ex01에서 사용한 코드를 재사용하기 위한 객체
 */

public class Ex02 {
	public static void main(String[] args) {
		DAO dao = new DAO();
		String ver = dao.test();
		
		System.out.println("ver = " + ver);
	}
}
