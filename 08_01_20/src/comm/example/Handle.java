package comm.example;

public class Handle {

	
	public static void main(String[] args)  {
		/* try 
		 {
			 System.out.println(3/0);
			 System.out.println("print hello");
			 
		 }
		 catch( ArithmeticException exc)
		 {
			 System.out.println(exc);
		 }
		
/
		System.out.println(args);
		
}
	
	*/	
	public void doTheWork()
	{
		
		
		Object o = null;
	        
	        for (int i=0; i<5; i++) {
	            try {
	                o = makeObj(i);
	            } catch (IllegalArgumentException e) {
	            	e.printStackTrace();
	                System.err.println("IllegalArgumentException is caught: (" + e.getMessage() + ").");
	                return;    
	            }
	            System.out.println(o);
		
}
	}
	            public Object makeObj( int type) throws IllegalArgumentException
	            {
	            	if(type == 1)
	            	throw new IllegalArgumentException("don't like type :" + type);
	            	
	            	return Object();
	            	
	            }
	            
	}ch
}
