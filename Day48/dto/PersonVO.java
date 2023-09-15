package dto;

/*
	NAME      VARCHAR2(20) 
	HEIGHT    NUMBER       
	BIRTH     DATE   
 */

import java.sql.Date;

public class PersonVO {
	private String name;
	private double height;
	private Date birth;
	
	public PersonVO() {}
	
	public PersonVO(String name, double height, Date birth) {
		super();
		this.name = name;
		this.height = height;
		this.birth = birth;
	}
	
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
	public void setBirth(String birth) {
		this.birth = Date.valueOf(birth);
	}
}
