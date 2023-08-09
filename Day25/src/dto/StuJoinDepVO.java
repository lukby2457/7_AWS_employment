package dto;

import java.sql.Date;

/*
	Student
	--------------------------------
	IDX      NOT NULL NUMBER        
	NAME     NOT NULL VARCHAR2(50)  
	GRADE    NOT NULL NUMBER        
	DEP_CODE NOT NULL NUMBER        
	GENDER            VARCHAR2(6)   
	BIRTH    NOT NULL DATE          
	ADDRESS           VARCHAR2(150) 
	PHONE    NOT NULL VARCHAR2(15)  
	EMAIL    NOT NULL VARCHAR2(100) 
	
	Department
	---------------------------------
	IDX    NOT NULL NUMBER        
	NAME   NOT NULL VARCHAR2(50)  
	D_DATE NOT NULL DATE          
	PHONE  NOT NULL VARCHAR2(15)  
	EMAIL  NOT NULL VARCHAR2(100) 
 */

public class StuJoinDepVO {
	private int idx, grade, dep_code;
	private String name, gender, address;
	private String phone, email, dep_name;
	private String dep_phone, dep_email;
	private Date birth, d_date;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getDep_code() {
		return dep_code;
	}
	public void setDep_code(int dep_code) {
		this.dep_code = dep_code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDep_name() {
		return dep_name;
	}
	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}
	public String getDep_phone() {
		return dep_phone;
	}
	public void setDep_phone(String dep_phone) {
		this.dep_phone = dep_phone;
	}
	public String getDep_email() {
		return dep_email;
	}
	public void setDep_email(String dep_email) {
		this.dep_email = dep_email;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public Date getD_date() {
		return d_date;
	}
	public void setD_date(Date d_date) {
		this.d_date = d_date;
	}

	
}
