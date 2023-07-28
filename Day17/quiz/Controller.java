package quiz;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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

			switch (menu) {
			case 1:	show(); break;
			case 2: join(); break;
			case 3: update(); break;
			case 4: delete(); break;
			case 5:	save(); break;
			case 6:	load(); break;
			case 0: break;
			default:
				System.out.println("잘못된 입력");	
			}

		} while (menu != 0);

		System.out.println("프로그램이 종료 되었습니다");
		sc.close();
	}
	
	private Student input() {
		String name;
		int kor, eng, mat;
		
		System.out.print("이름 : ");
		name = sc.next();
		
		System.out.print("국 영 수 : ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		return new Student(name, kor, eng, mat);
	}

	private void join() {
		list.add(input());
	}
	
	private void show() {
		System.out.println("\n학생 목록)");
		
		for(Student stu : list) {
			System.out.println(stu);
		}
		
	}
	
	private int search(String name) {
		Student find = new Student(name, 0, 0, 0);

		for (int i = 0; i < list.size(); i++) {
			if (find.equals(list.get(i))) {
				return i;
			}
		}
		
		return -1;
	}
	
	private void update() {
		System.out.print("수정할 이름 입력 : ");
		String name = sc.next();
		
		int index = search(name);
		
		if(index != -1) {
			Student newStu = input();
			list.set(index, newStu);
			
			System.out.println("수정 완료");
			return;
		}
		
		System.out.println("해당 데이터는 존재하지 않습니다");
		
	}

	private void delete() {
		System.out.print("삭제할 이름 입력 : ");
		String name = sc.next();
		
		int index = search(name);
		
		if(index != -1) {
			list.remove(index);
			
			System.out.println("삭제 완료");
			return;
		}
		
		System.out.println("해당 데이터는 존재하지 않습니다");
		
	}
	
	private void save() {
		try {
			BufferedWriter br = new BufferedWriter(new FileWriter("stuSave.txt"));
			
			for(Student stu : list) {
				String msg = stu.getInfo();
				br.write(msg);
			}
			
			br.close();
		} catch (IOException e) {
			System.err.println("예외 : " + e.getMessage());
		} 
	}
	
	private void load() {
		File save = new File("stuSave.txt");
		Scanner saveSc = null;
		
		try {
			saveSc = new Scanner(save);
			list.clear();
			
			while(saveSc.hasNextLine()) {
				String name = saveSc.next();
				int kor = saveSc.nextInt();
				int eng = saveSc.nextInt();
				int mat = saveSc.nextInt();
				
				list.add(new Student(name, kor, eng, mat));
			}
			
		} catch (IOException e) {
			System.err.println("Save가 없습니다!!!");
		} finally {
			saveSc.close();
		}
	}
	
}
