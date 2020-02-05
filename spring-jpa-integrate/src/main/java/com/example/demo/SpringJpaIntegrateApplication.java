package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaIntegrateApplication implements CommandLineRunner {
	
	private BookDAO bookDAO;
	
	@Autowired
	public SpringJpaIntegrateApplication(BookDAO bookDAO) {
		super();
		this.bookDAO = bookDAO;
	}

	public static void main(String[] args)  {
		SpringApplication.run(SpringJpaIntegrateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		
//		bookDAO.save(new Book("maths","rd "));
//		bookDAO.save(new Book("english","shakespear"));
//		
		
	}

}
