package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.Ex04DAO;
import com.itbank.model.VO.DepartmentVO;
import com.itbank.model.VO.PersonVO;

@Service
public class Ex04Service {
	
	@Autowired
	public Ex04DAO dao;

	public String test() {
		return dao.banner();
	}

	public List<PersonVO> getPersons() {
		return dao.selectAll();
	}

	public List<DepartmentVO> getDepartments() {
		return dao.selectDeptAll();
	}

}
