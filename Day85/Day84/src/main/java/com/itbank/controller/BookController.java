package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
		
		return bs.getBooks();
	}
	
	@GetMapping("/{idx}")
	public BookVO getBook(@PathVariable int idx) {
		
		return bs.getBook(idx);
	}
	
	@PostMapping
	public int addBook(BookVO input) {
		
		return bs.insertBook(input);
	}
}
