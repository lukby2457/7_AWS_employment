package jdbc;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import dto.AccountVO;
import model.AccountDAO;

public class Controller {
	private Scanner sc = new Scanner(System.in);
	private AccountDAO dao = new AccountDAO();
	private List<AccountVO> list = new ArrayList<AccountVO>();
	
	private static void showAll(List<AccountVO> list) {
		System.out.println("계정번호\t아이디\t비밀번호\t닉네임\t이메일\t\t가입일자");
		for(AccountVO row : list) {
			String format = "%d\t%s\t%s\t%s\t%s\t%s";
			format = String.format(format, row.getIdx(), row.getUserid(),
					row.getUserpw(), row.getNick(), 
					row.getEmail(), row.getJoin_date());
			
			System.out.println(format);
		}
		System.out.println();
	}
	
	public void run() {
		int menu;
		
		do {
			System.out.println("------------ 메뉴 ------------");
			System.out.println("\t1. 테이블 전체 출력");
			System.out.println("\t2. 테이블에 행 추가");
			System.out.println("\t3. 테이블 행 삭제");
			System.out.println("\t4. 테이블 행 수정");
			System.out.println("\t5. 테이블 지정 행 출력");
			System.out.println("\t0. 프로그램 종료");
			System.out.println("----------------------------");
			
			while(true) {
				try {
					System.out.print(">>> ");
					menu = sc.nextInt();
					break;
				
				} catch(InputMismatchException e) {
					System.out.println("숫자가 아닌 값을 입력하셨습니다\n");
					sc.nextLine();
				}
			}
			
			int idx, row;
			AccountVO acc;
			
			switch(menu) {
			case 1:
				list = dao.selectAll();
				
				showAll(list);
				
				continue;
			case 2:
				sc.nextLine();
				acc = AccountVO.inputInstance(sc);
				
				row = dao.insert(acc);
				System.out.println(row != 0 ? "성공하였습니다\n" : "실패하였습니다\n");
				
				continue;
			case 3:
				sc.nextLine();
				System.out.print("삭제할 계정번호 입력 : ");
				idx = sc.nextInt();
				
				row = dao.delete(idx);
				System.out.println(row != 0 ? "성공하였습니다\n" : "실패하였습니다\n");
				
				continue;
			case 4:
				sc.nextLine();
				System.out.print("수정할 계정번호 입력 : ");
				idx = sc.nextInt();
				acc = AccountVO.inputInstance(sc);
				
				row = dao.update(acc, idx);
				System.out.println(row != 0 ? "성공하였습니다\n" : "실패하였습니다\n");
				
				continue;
			case 5:
				sc.nextLine();
				System.out.print("검색할 계정번호 입력 : ");
				idx = sc.nextInt();
				
				list = dao.selectOne(idx);
				
				showAll(list);
				
				continue;
			case 0:
				break;
			default:
				System.out.println("메뉴에 없는 정수를 입력하셨습니다");
			}
			
		} while(menu != 0);
		
		System.out.println("프로그램 종료");
		sc.close();
	}
}
