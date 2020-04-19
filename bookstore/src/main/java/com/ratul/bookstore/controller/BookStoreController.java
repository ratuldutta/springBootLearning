package com.ratul.bookstore.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookStoreController {

	@RequestMapping("/")
	public List<String> index() {
		List<String> names = new ArrayList<>();
		names.add("Ratul");
		names.add("Rahul");
		return names;
	}

}