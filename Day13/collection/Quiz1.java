package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

//1. Person 클래스를 작성
// - 필드는 이름, 나이

class Person implements Comparable<Person> {
	private String name;
	private int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return String.format("%s (%d세)", name, age);
	}

	@Override
	public int compareTo(Person o) {
		return o.age - age;
	}
}

public class Quiz1 {
	public static void main(String[] args) {
		// 2. 1번의 클래스 객체를 3개 정도 생성
		Person per1 = new Person("유은애", 23);
		Person per2 = new Person("김진우", 29);
		Person per3 = new Person("이춘향", 30);
		
		// 3. 2번의 객체를 List에 순서대로 추가
		List<Person> pers = new ArrayList<Person>();
		pers.add(per1);
		pers.add(per2);
		pers.add(per3);
		pers.add(new Person("김성윤", 28));
			
		// 4. iterator를 사용해서 반복으로 모두 출력
		Iterator<Person> it = pers.iterator();
		
		while(it.hasNext()) {
			Person p1 = it.next();
			System.out.println(p1);
		}
		System.out.println();
		
		// 5. 이름 순으로 오름차순 정렬 후 출력
		Comparator<Person> nameAsc = (Person o1, Person o2) -> {
			String s1 = o1.getName();
			String s2 = o2.getName();
			return s1.compareTo(s2);
		};
		pers.sort(nameAsc);
		System.out.println(pers);
		System.out.println();
		
		// 6. 나이 순으로 내림차순 정렬 후 출력
		pers.sort(null);
		System.out.println(pers);
	}
}
