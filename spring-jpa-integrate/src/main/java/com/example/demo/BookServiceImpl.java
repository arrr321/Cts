package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
	
	public BookDAO bookdao;
	
	
	@Autowired
	public BookServiceImpl(BookDAO bookdao) {
		super();
		this.bookdao = bookdao;
	}

	@Override
	public List<Book> getAllbook() {
		
		return ((BookServiceImpl) bookdao).getAllbook();
	}

	@Override
	public Optional<Book> getBookById(int bookID) {

		Optional<Book> book=bookdao.findById(bookID);
		return book;
		
		
	
}

	@Override
	public Book createBook(Book book) {
		// TODO Auto-generated method stub
		return bookdao.save(book);
	}
}
