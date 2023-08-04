package jdbc;

import java.util.List;
import java.util.Scanner;

import dto.PersonDTO;
import model.PersonDAO;

public class Ex03 {
	public static void main(String[] args) {
		// 1. Person 테이블을 모두 출력
		PersonDAO dao = new PersonDAO();
		List<PersonDTO> list = dao.selectAll();
				
		Ex02.printall(list);
				
		System.out.println();
				
		// 2. 사용자에게 입력 받은 내용을 Person에서 삭제
		Scanner sc = new Scanner(System.in);
		String name;
		
		System.out.print("삭제할 이름 : ");
		name = sc.next();
		
		int row = dao.delete(name);
		System.out.println(row != 0 ? "성공" : "실패");
		
		Ex02.printall(dao.selectAll());
		sc.close();
	}
}
