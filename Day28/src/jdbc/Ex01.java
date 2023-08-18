package jdbc;

import java.util.List;

import dao.DAO;
import dto.EmpDTO;

public class Ex01 {
	private static void printList(List<EmpDTO> list) {
		System.out.println("idx\t\t이름\t연봉\t부서");
		for(EmpDTO row : list) {
			String format = "%d\t%s\t%d\t%s";
			format = String.format(format, row.getIdx(), row.getName(),
						row.getSalary(), row.getDepartment());
			System.out.println(format);
		}
	}
	
	public static void main(String[] args) {
		// DAO를 활용해서 sal_up 프로시저를 실행 후 반환값을 받아서 출력
		DAO dao = new DAO();
		System.out.println(dao.test());
		
		printList(dao.selectAll());	// 프로시저 실행 전
		
		int result = dao.sal_Up(20230108, 10);
		System.out.println("증가된 연봉은 " + result);
		
		printList(dao.selectAll());	// 프로시저 실행 후
	}

}
