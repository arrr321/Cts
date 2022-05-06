package com.exmp;

public class App {
	
	public int result() throws Exception{
		try {
			int i = 1/0;
			System.out.println(i);
			
			
		} catch (Exception e ) {
			
				
			result();
			System.out.println("Caught");
		
		}
		finally {
			
		}
		
		return 0;
		}
	
	   
}
