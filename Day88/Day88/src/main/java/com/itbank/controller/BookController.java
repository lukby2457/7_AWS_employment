package com.itbank.controller;

// 상세 내용은 info package의 package-info 참조

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public int addBook(@RequestBody BookVO input) {
//		System.out.println(input.getIdx());
//		System.out.println(input.getTitle());
//		System.out.println(input.getWriter());
//		System.out.println(input.getPublisher());
//		System.out.println(input.getP_date());
//		System.out.println(input.getPrice());
		
		return bs.addBook(input);
	}
	
	@PutMapping
	public int updateBook(@RequestBody BookVO input) {
		
		return bs.updateBook(input);
	}
	
	@PatchMapping
	public int updateBookPrice(@RequestBody BookVO input) {
		
		return bs.updatePrice(input);
	}
	
	@DeleteMapping("/{idx}")
	public int deleteBook(@PathVariable int idx) {
		
		return bs.deleteBook(idx);
	}
	
}
