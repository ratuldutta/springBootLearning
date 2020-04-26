package com.ratul.bookstore.model;

class BookNotFoundException extends RuntimeException {

  BookNotFoundException(Long id) {
    super("Could not find employee " + id);
  }
}