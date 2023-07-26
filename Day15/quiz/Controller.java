package quiz;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class Controller {
	private Scanner sc = new Scanner(System.in);
	private LinkedList<Student> list = new LinkedList<Student>();

	public void run() {
		int menu;

		do {
			System.out.println("------------ 메뉴 ------------");
			System.out.println("\t 1. 학생 목록");
			System.out.println("\t 2. 학생 정보 입력");
			System.out.println("\t 3. 학생 정보 수정");
			System.out.println("\t 4. 학생 정보 제거");
			System.out.println("\t 5. 저장");
			System.out.println("\t 6. 불러오기");
			System.out.println("\t 0. 프로그램 종료");

			while(true) {
				try {
					System.out.print(">>> ");
					menu = sc.nextInt();
					break;
				
				} catch(InputMismatchException e) {
					System.err.println("정수를 입력해 주세요\n");
					sc.nextLine();
				}
			}

			if(menu == 1) {
				System.out.println(list);
			}
			
			else if(menu == 2) {
				System.out.print("이름 입력 : ");
				String inputName = sc.next();
				System.out.print("국 영 수 입력 : ");
				int inputKor = sc.nextInt();
				int inputEng = sc.nextInt();
				int inputMat = sc.nextInt();
				list.add(new Student(inputName, inputKor, inputEng, inputMat));
				System.out.println(inputName + " 학생의 정보를 추가하였습니다");
			}
			
			else if(menu == 3) {
				System.out.print("이름 입력 : ");
				String inputName = sc.next();
				for (int i = 0; i < list.size(); i++) {
					if (inputName.equals(((Student) list.get(i)).getName())) {
						list.remove(i);
						System.out.print("국 영 수 입력 : ");
						int inputKor = sc.nextInt();
						int inputEng = sc.nextInt();
						int inputMat = sc.nextInt();
						list.add(new Student(inputName, inputKor, inputEng, inputMat));
						System.out.println("수정이 완료되었습니다");
						inputName = "";
						break;
					}
				}
				if(inputName != "") {
					System.out.println("이름으로 검색된 결과가 없습니다");
				}
				
			}
			
			else if(menu == 4) {
				System.out.print("이름 입력 : ");
				String inputName = sc.next();
				for (int i = 0; i < list.size(); i++) {
					if (inputName.equals(((Student) list.get(i)).getName())) {
						list.remove(i);
						System.out.println("삭제가 완료되었습니다");
						inputName = "";
						break;
					}
				}
				if(inputName != "") {
					System.out.println("이름으로 검색된 결과가 없습니다");
				}
			}
			
			else if(menu == 5) {
				
			}
			
			else if(menu == 6) {
				
			}
			
			else if(menu == 0) {
				break;
			}
			
			else {
				System.out.println("메뉴에 없는 값을 입력하였습니다");
			}

		} while (menu != 0);

		System.out.println("프로그램이 종료 되었습니다");
		sc.close();
	}
}
