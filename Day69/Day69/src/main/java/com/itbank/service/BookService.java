package com.itbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.BookDAO;

@Service
public class BookService {
	
	@Autowired
	private BookDAO dao;

	public Object getLists() {
		return dao.selectAll();
	}

	public Object getList(int idx) {
		return dao.selectOne(idx);
	}
}
