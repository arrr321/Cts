package com.example.demo;

import java.util.List;
import java.util.Optional;


public interface BookService {
	
	public List<Book> getAllbook();
	public Optional<Book> getBookById(int bookID);
	public Book createBook(Book book);
}
