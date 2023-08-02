package dto;

import java.sql.Date;

// DTO : Data Transfer Object
// - 데이터를 주고 받기 위한 객체
// - DAO와 이름이 유사해 VO (= Value Object)라고도 한다

public class PersonVO {
	// Person Table의 정보를 주고 받을거라
	// Person Table의 열 정보를 필드로 가지면 된다
	public String name;
	public double height;
	public Date birth;
	
	
}
