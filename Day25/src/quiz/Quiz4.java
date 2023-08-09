package quiz;

import java.util.List;
import java.util.Map;

import model.StuDepProDAO;

//import java.util.List;
//
//import dto.JoinVO;
//import model.JoinDAO;

public class Quiz4 {
	// 문제4 : 학생 정보를 출력 (단, 학번, 학생이름, 전공 이름, 전공 교수 이름) stuA, depB, proC
	public static void main(String[] args) {
//		JoinDAO dao = new JoinDAO();
//		
//		List<JoinVO> list = dao.printProStu();
//		
//		System.out.println("학생 학번\t\t학생 이름\t전공 이름\t교수 이름");
//		for(JoinVO row : list) {
//			String format = "%d\t%s\t%s\t%s";
//			format = String.format(format, row.getStu_num(), row.getStu_name(),
//							row.getDep_name(), row.getPro_name());
//			System.out.println(format);
//		}
		
		StuDepProDAO dao = new StuDepProDAO();
		
		List<Map<String, Object>> list = dao.selectAll();
		
		printList(list);
		
	}

	private static void printList(List<Map<String, Object>> list) {
		for(Map<String, Object> row : list) {
			String msg = "%s\t%s\t%s\t%s";
			
			msg = String.format(msg, row.get("idx"), row.get("name"),
						row.get("dep_name"), row.get("pro_name"));
			
			System.out.println(msg);
		}
		
	}
}
