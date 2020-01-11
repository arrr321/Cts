package comm.example;

public class Threadtask extends Thread

{
	
	public void run() {
		
		for(int i = 0; i<10 ; i++)
		{
			System.out.println(i+"name : " +Thread.currentThread().getName()+ "id :"+Thread.currentThread().getId() + "priority: " + Thread.currentThread().getPriority());
			
		}
		
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {

		/*Threadtask t1 =	new Threadtask();
		Threadtask t2 =  new Threadtask();
		t1.run();
		sleep(1000);

		t2.run();
		sleep(1000);

		t1.setPriority(10);
		t2.setPriority(5);
		System.out.println("hello");
		*/
		 new SimpleThread("Boston").start();
	        new SimpleThread("New York").start();
	        new SimpleThread("Seoul").start();
	        
	        ThreadGroup group = Thread.currentThread().getThreadGroup();
	        System.out.println("Number of active threads in this thread group = " 
	                            + group.activeCount());
	        
	        // Display the names of the threads in the current
	        // ThreadGroup.
	        Thread[] tarray = new Thread[10];
	        int actualSize = group.enumerate(tarray);
	        for (int i=0; i<actualSize;i++){
	            System.out.println("Thread " + tarray[i].getName() 
	                               + " in thread group " + group.getName());}
	            System.out.println("Max :" + Thread.MAX_PRIORITY);
	            System.out.println("Min :" +Thread.MIN_PRIORITY);
	            System.out.println("Normal :" +Thread.NORM_PRIORITY);
	        }
	}
	
	
