package com.ratul.bookstore.utility;

import com.ratul.bookstore.model.Book;

public class BookStoreUtils {
	public static Integer getBookPrice(Book book) {
		if (null == book) {
			return null;
		}
		if (book.getBookName().equals("story")) {
			return 200;
		} else
			return 500;
	}

}
