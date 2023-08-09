package quiz;

import java.util.List;
import java.util.Map;

import model.ProfessorDAO;

//import java.util.List;
//
//import dto.JoinVO;
//import model.JoinDAO;

public class Quiz3 {
	// 문제3 : 교수의 정보를 출력 (단, 교수 번호, 교수 이름, 교수 연락처, 전공 이름, 전공 연락처)
	public static void main(String[] args) {
//		JoinDAO dao = new JoinDAO();
//		
//		List<JoinVO> list = dao.printPro();
//		
//		System.out.println("교수 번호\t교수 이름\t교수 연락처\t\t전공 이름\t전공 연락처");
//		for(JoinVO row : list) {
//			String format = "%d\t%s\t%s\t%s\t%s";
//			format = String.format(format, row.getPro_num(), row.getPro_name(), 
//					row.getPro_phone(), row.getDep_name(), row.getDep_phone());
//			System.out.println(format);
//		}
		
		ProfessorDAO dao = new ProfessorDAO();
		List<Map<String, Object>> list = dao.selectPJD();
		
		printList(list);
		
		
	}

	static void printList(List<Map<String, Object>> list) {
		
		for(Map<String, Object> row : list) {
			String msg = "%d\t%s\t%s\t%s\t%s";
			
			msg = String.format(msg, row.get("idx"), row.get("name"), row.get("phone"), 
					row.get("dep_name"), row.get("dep_phone"));
			
			System.out.println(msg);
		}
		
	}
}
