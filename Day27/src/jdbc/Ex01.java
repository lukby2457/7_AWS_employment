package jdbc;

import dao.DAO;

public class Ex01 {
	public static void main(String[] args) {
		DAO dao = new DAO();
		String ver = dao.test();
		
		System.out.println(ver);
		
		int result = dao.proTest();
		System.out.println(result);
	}
}
