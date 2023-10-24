package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.beans.BookVO;
import com.itbank.model.BookDAO;

@Service
public class BookService {
	
	@Autowired
	private BookDAO dao;

	public List<BookVO> getLists() {
		return dao.selectAll();
	}

	public BookVO getList(int idx) {
		return dao.selectOne(idx);
	}

	public int insert(BookVO input) {
		return dao.insert(input);
	}

	public int update(BookVO input) {
		return dao.update(input);
	}

	public int delete(int idx) {
		return dao.delete(idx);
	}
	
}
