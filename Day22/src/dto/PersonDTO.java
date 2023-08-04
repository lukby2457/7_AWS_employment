package dto;

import java.sql.Date;
import java.util.Scanner;

/*
	NAME      VARCHAR2(20) 
	HEIGHT    NUMBER       
	BIRTH     DATE    
 */

public class PersonDTO {
	private String name;
	private double height;
	private Date birth;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	
	public static PersonDTO inputInstance(Scanner sc) {
		
		PersonDTO per = new PersonDTO();
		
		System.out.print("이름 신장 생년월일 : ");
		
		per.name = sc.next();
		per.height = sc.nextDouble();
		per.birth = Date.valueOf(sc.next());
		// valueOf(문자열) : 전달한 문자열을 Date 타입으로 반환
		// - ※ 형식은 2023-08-04 같은 형태로 지정
		
		return per;
	}
}
