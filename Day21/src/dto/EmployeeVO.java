package dto;

import java.sql.Date;

/*
	IDX        NOT NULL NUMBER        
	NAME       NOT NULL VARCHAR2(20)  
	GENDER              VARCHAR2(6)   
	BIRTH      NOT NULL DATE          
	H_DATE     NOT NULL DATE          
	PHONE      NOT NULL VARCHAR2(15)  
	EMAIL      NOT NULL VARCHAR2(150) 
	POSITION   NOT NULL VARCHAR2(20)  
	SALARY     NOT NULL NUMBER        
	DEPARTMENT          VARCHAR2(50)  
	DEP_CREATE          DATE          
	DEP_PHONE           VARCHAR2(15)  
	DEP_EMAIL           VARCHAR2(150)
 */

public class EmployeeVO {
	private int idx;
	private String name, gender;
	private Date birth, h_date;
	private String phone, email, position;
	private int salary;
	private String department;
	private Date dep_create;
	private String dep_phone, dep_email;
	private int sum, max, min;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
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
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public Date getH_date() {
		return h_date;
	}
	public void setH_date(Date h_date) {
		this.h_date = h_date;
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
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getDep_create() {
		return dep_create;
	}
	public void setDep_create(Date dep_create) {
		this.dep_create = dep_create;
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
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	
	
	
}
