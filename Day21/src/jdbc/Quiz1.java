package jdbc;

import java.util.List;

import dto.EmployeeVO;
import model.EmployeeDAO;

public class Quiz1 {
	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAO();
//		System.out.println(dao.test());
		
		// 1. employee 테이블 전체를 출력
		// 단, idx 순으로 내림차순
		List<EmployeeVO> list = dao.selectAll();
		
		for(EmployeeVO row : list) {
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
		String list2 = dao.countAll();
		
		System.out.println("테이블의 행 개수 : " + list2);
		
		System.out.println();
		
		// 3. employee 테이블에서 연봉의 총합, 최대, 최소를 출력
		List<EmployeeVO> list3 = dao.salary();
		
		System.out.println("연봉 합계\t최대 연봉\t최소 연봉");
		for(EmployeeVO row : list3) {
			String format = "%d\t%d\t%d";
			format = String.format(format, row.getSum(), row.getMax(), row.getMin());
			System.out.println(format);
		}
		
		System.out.println();
		
		// 4. employee 테이블에서 직급별 연봉의 총합, 최대, 최소를 출력
		// 단, 연봉 총합으로 내림차순
		List<EmployeeVO> list4 = dao.positionSalary();
		
		System.out.println("직급\t연봉 합계\t최대 연봉\t최소연봉");
		for(EmployeeVO row : list4) {
			String format = "%s\t%d\t%d\t%d";
			format = String.format(format, row.getPosition(), row.getSum(), row.getMax(), row.getMin());
			System.out.println(format);
		}
		
		System.out.println();
		
		// 5. employee 테이블에서 부서별 연봉의 총합, 최대, 최소를 출력
		// 단, 연봉 총합이 10000 이상인 부서만 출력
		List<EmployeeVO> list5 = dao.departmentSalary();
		
		System.out.println("부서\t연봉 합계\t최대 연봉\t최소연봉");
		for(EmployeeVO row : list5) {
			String format = "%s\t%d\t%d\t%d";
			format = String.format(format, row.getDepartment(), row.getSum(), row.getMax(), row.getMin());
			System.out.println(format);
		}
	}
}
