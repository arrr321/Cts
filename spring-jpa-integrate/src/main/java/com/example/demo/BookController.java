package com.example.demo;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cont")
public class BookController {
	
	private BookService bookservice;

	@Autowired
	public BookController(BookService bookservice) {
		super();
		this.bookservice = bookservice;
	}
	
	@ExceptionHandler
	public ResponseEntity<ErrorMessage> handleError1(BookNotFoundException bne)
	{
		ErrorMessage errorMessage=new ErrorMessage();
		errorMessage.setMessage(bne.getMessage());
		errorMessage.setStatus(HttpStatus.NOT_FOUND.value());
		errorMessage.setErrorTime(System.currentTimeMillis());
		return new ResponseEntity<ErrorMessage>(errorMessage,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler
	public ResponseEntity<ErrorMessage> handleError2(Exception e)
	{
		ErrorMessage errorMessage=new ErrorMessage();
		errorMessage.setMessage(e.getMessage());
		errorMessage.setStatus(HttpStatus.BAD_REQUEST.value());
		errorMessage.setErrorTime(System.currentTimeMillis());
		return new ResponseEntity<ErrorMessage>(errorMessage,HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/books")
	@Transactional
	public List<Book> getAll()
	{
		return bookservice.getAllbook();
	}
	@Transactional
	@GetMapping("/books/{bookId}")
	public Optional<Book> getBookById(@PathVariable Integer bookId) throws Exception
	{
		Optional<Book> book=bookservice.getBookById(bookId);
		if(!book.isPresent())
		{
			throw new BookNotFoundException("book not found with id: "+bookId);
		}
		
		return book; 
	}
	@PostMapping("/books")
	public Book createBook(@RequestBody Book book)
	{
		
		book.setBookId(1);
		
		
		return bookservice.createBook(book);
	}
		
		
	
	@PutMapping("/books")
	public Book updateBook(@RequestBody Book book)
	{
		return bookservice.createBook(book);
		
	}
	
	@DeleteMapping("/books/{bookId}")
	public void deleteById(@PathVariable Integer bookId)
	{
		bookservice.deleteBookByid(bookId);
		
		
	}
	@DeleteMapping("/books")
	public void deleteAll()
	{
		
		bookservice.deleteAll();
	}
	
	@GetMapping("books/findByAuthor/{author}")
	public List<Book> findByauthor(@PathVariable String author)
	{
		return bookservice.findByauthor(author);
		
	}
	
	@GetMapping("books/findByBook/{bookName}")
	public List<Book> findBybookName(@PathVariable String bookName)
	{
		return bookservice.findBybookName(bookName);
	

}

	
}
	


