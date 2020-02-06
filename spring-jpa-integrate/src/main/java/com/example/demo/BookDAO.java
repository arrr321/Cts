package com.example.demo;



import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface BookDAO extends JpaRepository<Book, Integer> {
public List<Book> findByauthor(String author);
public List<Book> findBybookName(String bookName);
	

}


