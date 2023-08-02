package jdbc;

import java.util.List;

import dto.PersonVO;
import model.PersonDAO;

public class Ex04 {
	public static void main(String[] args) {
		PersonDAO dao = new PersonDAO();
		
		String ver = dao.test();
		System.out.println(ver + "\n");
		
		List<PersonVO> list = dao.selectAll();
		
		System.out.println("이름\t신장\t생년월일");
		System.out.println("--------------------------");
		
		for (PersonVO row : list) {
			System.out.printf("%s\t%.1f\t%s\n", row.name, row.height, row.birth);
		}
	}
}
