package com.ratul.bookstore.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ratul.bookstore.model.Book;
import com.ratul.bookstore.model.BookRepository;

@RestController
public class BookStoreController {
	
	private final BookRepository repository;

	public BookStoreController(BookRepository repository) {
		super();
		this.repository = repository;
	}
	
	@GetMapping("/books")
	List<Book> getBooks(){
		return repository.findAll();
	}

	/*
	 * @RequestMapping("/") public List<String> index() { List<String> names = new
	 * ArrayList<>(); names.add("Ratul"); names.add("Rahul"); return names; }
	 */
	
	

}