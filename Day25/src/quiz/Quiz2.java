package quiz;

import java.util.List;

import dto.StuJoinDepVO;
import model.StudentDAO;

//import java.util.List;
//
//import dto.JoinVO;
//import model.JoinDAO;

public class Quiz2 {
	// 문제2 : 컴공인 학생의 정보를 출력 (단, 학번, 이름, 연락처, 학과명, 학과 연락처)
	public static void main(String[] args) {
//		JoinDAO dao = new JoinDAO();
//		
//		List<JoinVO> list = dao.printComStu();
//		
//		System.out.println("학생 학번\t\t학생 이름\t학생 전화번호\t학과명\t학과 전화번호");
//		for(JoinVO row : list) {
//			String format = "%d\t%s\t%s\t%s\t%s";
//			format = String.format(format, row.getStu_num(), row.getStu_name(), 
//					row.getStu_phone(), row.getDep_name(), row.getDep_phone());
//			System.out.println(format);
//		}
		
		StudentDAO dao = new StudentDAO();
		List<StuJoinDepVO> list = dao.selectSJD(true);
		
		Quiz1.printList(list);
	}
}
