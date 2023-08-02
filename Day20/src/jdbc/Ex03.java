package jdbc;

import model.DAO;

// OOP : 객체 지향의 핵심은 '재사용'

public class Ex03 {
	public static void main(String[] args) {
		DAO dao = new DAO();
		String version = dao.test();
		
		System.out.println(version);
	}
}
