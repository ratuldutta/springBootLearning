package com.ratul.bookstore;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BookStoreController {

	@RequestMapping("/")
	public String index() {
		return "Ratul first boot application!!";
	}

}