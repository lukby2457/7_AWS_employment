package jdbc;

import java.util.List;

import dto.EmployeeDTO;
import dto.EmployeeExDTO;
import model.EmployeeDAO;

public class Quiz1 {
	
	private static void printPosition(List<EmployeeExDTO> pList) {
		for(EmployeeExDTO row : pList) {
			String msg = row.getPosition() + "\t"
					+ row.getSum() + "\t"
					+ row.getMax() + "\t"
					+ row.getMin();
			
			System.out.println(msg);
		}
		
	}
	
	private static void printDep(List<EmployeeExDTO> pList) {
		for(EmployeeExDTO row : pList) {
			String msg = row.getDepartment() + "\t"
					+ row.getSum() + "\t"
					+ row.getMax() + "\t"
					+ row.getMin();
			
			System.out.println(msg);
		}
		
	}
	
	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAO();
//		System.out.println(dao.test());
		
		// 1. employee 테이블 전체를 출력
		// 단, idx 순으로 내림차순
		List<EmployeeDTO> list = dao.selectAll();
		
		for(EmployeeDTO row : list) {
			String format = "%d\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%d\t%s\t%s\t%s\t%s";
			format = String.format(format, row.getIdx(), row.getName(), row.getGender(), 
					row.getBirth(), row.getH_date(), row.getPhone(), row.getEmail(), 
					row.getPosition(), row.getSalary(), row.getDepartment(), row.getDep_create(), 
					row.getDep_phone(), row.getDep_email()
					);
			System.out.println(format);
		}
		
		System.out.println();
		
		// 2. employee 테이블의 전체 행 개수를 출력
		System.out.println("employee 테이블의 전체 행 개수 : " + dao.totalRow());
		
		System.out.println();
		
		// 3. employee 테이블에서 연봉의 총합, 최대, 최소를 출력
		EmployeeExDTO row = dao.summary();
		
		System.out.println("사원 전체 연봉 현황)");
		String format = "총합 : %d\n최대 : %d\n최소 : %d";
		format = String.format(format, row.getSum(), row.getMax(), row.getMin());
		System.out.println(format);
		
		System.out.println();
		
		// 4. employee 테이블에서 직급별 연봉의 총합, 최대, 최소를 출력
		// 단, 연봉 총합으로 내림차순
		List<EmployeeExDTO> pList = dao.selectPosition();
		printPosition(pList);
		
		// 5. employee 테이블에서 부서별 연봉의 총합, 최대, 최소를 출력
		// 단, 연봉 총합이 10000 이상인 부서만 출력
		System.out.println();
		List<EmployeeExDTO> dlist = dao.selectDep();
		printDep(dlist);
		
	}
}
