package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.BookDAO;
import com.itbank.model.vo.BookVO;

@Service
public class BookService {
	
	@Autowired private BookDAO dao;

	public String getVersion() {
		return dao.test();
	}

	public List<BookVO> getBooks() {
		return dao.selectAll();
	}

	public BookVO getBook(int idx) {
		return dao.selectOne(idx);
	}

	public int insert(BookVO input) {
		return dao.insert(input);
	}
	
}
