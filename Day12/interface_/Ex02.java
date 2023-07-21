package interface_;

import java.util.Arrays;
import java.util.Comparator;

class Person implements Comparable<Person> {
	private String name;
	private int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 내가 원하는 대로 출력할려면 toString()이 오버라이드 되어 있어야 한다
	@Override
	public String toString() {
		return name + " (" + age + "세)";
	}

	@Override
	public int compareTo(Person o) {	// Person의 기본 비교 기준
		// this : 앞, o : 뒤
		return age - o.age;		// this.age - o.age
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
}

public class Ex02 {
	public static void main(String[] args) {
		Person[] pers = new Person[] {
			new Person("홍길동", 30),
			new Person("김민지", 26),
			new Person("박민철", 18)
		};
		
		System.out.println("pers = " + Arrays.toString(pers));
		
		System.out.println(pers[0]);
		
		Arrays.sort(pers);	// 비교 기준이 있어야 정렬이 가능 (comparator를 사용 || comparable을 사용)
		System.out.println("pers = " + Arrays.toString(pers));
		
		Comparator<Person> ageDesc = (Person o1, Person o2) -> {	// Person의 기타 비교 기준
			return o2.getAge() - o1.getAge();
		};
		
		Arrays.sort(pers, ageDesc);
//		Arrays.sort(pers, (Person o1, Person o2) -> o2.getAge() - o1.getAge());
		System.out.println("pers = " + Arrays.toString(pers));
	}
}
