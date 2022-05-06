package com.exmp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

class TestShow{
	
	
	public static void main(String[] args) throws IOException {
//		args = null;
		System.out.println(Arrays.toString(args));
		System.out.println(args.length);
		
		File f = new File("C:\\Users\\844251\\hey.txt");
		f.createNewFile();
		
		FileWriter file = new FileWriter(f);
		file.write("jjkwskwwewjel");
		file.close();
		
		System.out.println(f);
		
		
	}
	
	
	
}