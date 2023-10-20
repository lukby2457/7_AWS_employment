package com.itbank.model.VO;

import java.sql.Date;

/*
	IDX        NOT NULL NUMBER        
	NAME       NOT NULL VARCHAR2(50)  
	DEP_CREATE NOT NULL DATE          
	PHONE      NOT NULL VARCHAR2(15)  
	EMAIL      NOT NULL VARCHAR2(100) 
 */

public class DepartmentVO {
	private int idx;
	private Date dep_create;
	private String name, phone, email;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public Date getDep_create() {
		return dep_create;
	}
	public void setDep_create(Date dep_create) {
		this.dep_create = dep_create;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
}
