package quiz;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

/*
	Main을 작동하는 Controller클래스 입니다.
	run()은 menu에 정수값을 입력 받아 입력값에 따라 조건문을 수행하는 메서드입니다.
	checkId()는 id중복 검사를 체크하는 메서드입니다.
 */

public class Controller {
	private Scanner sc = new Scanner(System.in);
	private LinkedList<Member> list = new LinkedList<Member>();
	
	private boolean checkId(String id) {
		boolean check = false;
		for(Member m : list) {
			if(id.equals(m.getId())) {
				check = true;
			}
		}
		return check;
	}
	
	public void run() {
		int menu;
		
		do {
			System.out.println("------------ 메뉴 ------------");
			System.out.println("\t 1. 회원 목록");
			System.out.println("\t 2. 회원 가입");
			System.out.println("\t 3. 회원 검색");
			System.out.println("\t 4. 회원 정렬");
			System.out.println("\t 5. 회원 탈퇴");
			System.out.println("\t 0. 프로그램 종료");
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
			
			switch(menu) {
			// list의 Member들을 한줄씩 출력합니다.
			case 1:
				for(int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
				continue;
			
			// 판매자인지 구매자인지 구분하여서 list에 회원가입을 진행합니다.
			case 2:
				String id;
				
				do {
					System.out.print("ID : ");
					id = sc.next();
				} while(checkId(id));
				// 아이디가 중복일때는 ID : 을 다시 출력합니다
				// 중복이 아닐시에는 다음인 비밀번호 : 를 출력합니다
				
				System.out.print("비밀번호 : ");
				String password = sc.next();
				
				System.out.print("이름 : ");
				String name = sc.next();
				
				String divide;
				while(true) {
					System.out.print("계정 유형 (판매자/구매자 글자 그대로 입력해주세요) : ");
					divide = sc.next();
					
					if(divide.equals("판매자")) {
						sc.nextLine();
						System.out.print("가게 이름을 입력해주세요 ");
						String storeName = sc.nextLine();
						
						list.add(new Seller(id, password, name, storeName));
						System.out.println("판매자 계정으로 회원가입을 완료하였습니다");
						break;
					}
					else if(divide.equals("구매자")) {
						sc.nextLine();
						System.out.print("배송지 주소를 입력해주세요 ");
						String address = sc.nextLine();
						
						list.add(new Customer(id, password, name, address));
						System.out.println("구매자 계정으로 회원가입을 완료하였습니다");
						break;
					}
					else {
						System.out.println("계정 유형을 다시 입력해주세요");
					}
				}
				
				continue;
			
			// ID값을 이용하여서 회원정보와 함께 회원유형인 판매자, 구매자를 출력합니다.
			case 3:
				System.out.print("ID 입력 : ");
				String fid = sc.next();
				for(int i = 0; i < list.size(); i++) {
					if(fid.equals(((Member)list.get(i)).getId())) {
						if(list.get(i) instanceof Seller) {
							Seller sel = (Seller)list.get(i);
							System.out.println("유형 : 판매자, " + sel.toString());
						}
						else {
							Customer cus = (Customer)list.get(i);
							System.out.println("유형 : 구매자, " + cus.toString());
						}
						fid = "";
					}
				}
				if(fid != "") {
					System.out.println("일치하는 ID가 없습니다");
				}
				continue;
				
			// Comparable로 list를 ID순으로 정렬합니다.
			case 4:
				list.sort(null);
				System.out.println("ID순으로 정렬이 완료되었습니다");
				continue;
			
			// ID값을 입력받아서 회원을 list에서 삭제시킵니다.
			case 5:
				System.out.print("ID 입력 : ");
				fid = sc.next();
				for(int i = 0; i < list.size(); i++) {
					if(fid.equals(((Member)list.get(i)).getId())) {
						list.remove(i);
						System.out.println("삭제가 완료 되었습니다");
						fid = "";
					}
				}
				if(fid != "") {
					System.out.println("일치하는 ID가 없습니다");
				}
				continue;
			
			// switch문을 종료시킵니다.
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
