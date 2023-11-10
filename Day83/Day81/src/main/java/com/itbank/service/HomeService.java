package com.itbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.DAO;

@Service
public class HomeService {
	
	@Autowired private DAO dao;

	public String getVersion() {
		return dao.test();
	}

}
