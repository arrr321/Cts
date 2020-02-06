package com.example.demo;

import java.util.List;
import java.util.Optional;


public interface BookService {
	
	public List<Book> getAllbook();
	public Optional<Book> getBookById(int bookID);
	public Book createBook(Book book);
	public void deleteAll();
	public void deleteBookByid(Integer bookId);
	public List<Book> findByauthor(String author);
	public List<Book> findBybookName(String bookName);

}
