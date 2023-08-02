package jdbc;

import java.util.List;

import dto.StudentVO;
import model.StudentDAO;

public class Ex05 {
	public static void main(String[] args) {
		// 아래 코드 실행되게 구현
		// - test_student 테이블 목록을 모두 가져온다
		StudentDAO dao = new StudentDAO();
		List<StudentVO> list = dao.selectAll();
		
		// 2. 그 후 모두 출력
		// 단, 간격은 크게 신경쓰지 않는다
		for(StudentVO row : list) {
			System.out.print(row.toString());
			System.out.printf("(합계 : %d, 평균 : %.2f)\n", row.getTotal(), row.getAvg());
		}
		
		
	}
}
