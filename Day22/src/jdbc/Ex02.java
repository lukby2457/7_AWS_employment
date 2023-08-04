package jdbc;

import java.util.List;
import java.util.Scanner;

import dto.PersonDTO;
import model.PersonDAO;

public class Ex02 {
	
	static void printall(List<PersonDTO> list) {
		for(PersonDTO row : list) {
			String format = "%s\t%.1f\t%s";
			format = String.format(format, row.getName(), row.getHeight(), row.getBirth());
			System.out.println(format);
		}
		
	}
	
	public static void main(String[] args) {
		// 상속 테스트
		PersonDAO dao = new PersonDAO();
//		System.out.println(dao.test());
		
		// 1. Person 테이블을 모두 출력
		List<PersonDTO> list = dao.selectAll();
		
		printall(list);
		
		System.out.println();
		
		// 2. 사용자에게 입력 받은 내용을 Person에 추가
		Scanner sc = new Scanner(System.in);
		PersonDTO per = PersonDTO.inputInstance(sc);
		
		// 디버깅용
//		System.out.println(per.getName());
//		System.out.println(per.getHeight());
//		System.out.println(per.getBirth());
		
		int row = dao.insert(per);
		// select는 표로 반환되지만 update, delete, insert는 행 개수로 반환된다
		
		System.out.println(row != 0 ? "성공" : "실패");
		
		System.out.println();
		
		// 3. 추가 후 다시 테이블을 모두 출력
		printall(dao.selectAll());
		sc.close();
	}
}
