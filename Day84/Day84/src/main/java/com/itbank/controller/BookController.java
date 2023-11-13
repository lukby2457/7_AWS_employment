package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itbank.model.vo.BookVO;
import com.itbank.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired BookService bs;

	@GetMapping
	public List<BookVO> getBooks() {
		
		List<BookVO> list = bs.getBooks();
		
		return list;
	}
	
	@GetMapping("/{idx}")
	public BookVO getBook(@PathVariable int idx) {
		BookVO book = bs.getBook(idx);
		
		return book;
	}
}
