package com.example;

import java.io.File;
import java.io.FileOutputStream;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {

	public static void main(String[] args)  {
		
		try {
		
		ObjectMapper mapper = new ObjectMapper();
		Student st = mapper.readValue(new File("student.json"), Student.class);
		System.out.println(st);
		
	
//		String d = mapper.writeValueAsString(st);
//		FileOutputStream f= new FileOutputStream("print.json");
		mapper.writeValue(new File("print.json"), st);
		}
		
		
		 catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}
