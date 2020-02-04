package com.example.demo;

import java.util.List;
import java.util.Optional;

public interface BookDAO {

	public List<Book> getAllbook();
	public Optional<Book> getBookById(int bookID);
	public Optional<Book> findById(int bookID);

}


