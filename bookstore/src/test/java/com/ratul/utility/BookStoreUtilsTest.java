package com.ratul.utility;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.ratul.bookstore.model.Book;
import com.ratul.bookstore.utility.BookStoreUtils;


public class BookStoreUtilsTest {

	@Test
	public void getBookPrice() {
		Book book = new Book();
		book.setBookName("story");
		assertEquals("Expected price of book", Integer.valueOf(200), BookStoreUtils.getBookPrice(book));

	}

}
