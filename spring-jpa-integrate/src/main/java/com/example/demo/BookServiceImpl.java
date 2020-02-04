package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

public class BookServiceImpl implements BookService {
	
	public BookDAO bookdao;
	
	
	@Autowired
	public BookServiceImpl(BookDAO bookdao) {
		super();
		this.bookdao = bookdao;
	}

	@Override
	public List<Book> getAllbook() {
		
		return bookdao.getAllbook();
	}

	@Override
	public Optional<Book> getBookById(int bookID) {

		Optional<Book> book=bookdao.findById(bookID);
		return book;

}
}
