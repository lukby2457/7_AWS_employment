package inheritence;

import other.Person;

/*
	클래스 간에는 상속 관계일때 서로 형변환이 가능하다
	1. up-casting 	: 자식 인스턴스를 부모로 참조하는 경우
	2. down-casting : '업 캐스팅 된 인스턴스'를 다시 자식으로 참조하는 경우
 */

public class Ex03 {
	public static void main(String[] args) {
		Student stu = new Student("김수진", 17, 85);
		
		// 업 캐스팅 : 자식 인스턴스를 부모로 참조
		Person per1 = stu;
		Person per2 = new Police("박철수", 37, "경감");
		
		// 특징 1. 부모의 멤버는 그대로 사용 가능
		per1.showInfo();
		per2.showInfo();
		
		// 특징 2. 원래 자식의 멤버는 사용 불가능
		//per1.study("Java");
		//per2.patrol("해운대구");
		
		
		// 다운 캐스팅 : 업 캐스팅 된 인스턴스를 다시 원래 타입으로 참조
		Student tmp = (Student) per1;
		
		// 특징 1. 원래 자식의 멤버를 다시 참조할 수 있게 된다
		tmp.study("Python");	// 웬만하면 추천
		
		((Police)per2).patrol("해운대구");
		
		// 특징 2. 원래 타입과 다른 타입으로 변환하면 error
		Student tmp2 = (Student) per2;
		tmp2.study("Java");
		
	}
}
