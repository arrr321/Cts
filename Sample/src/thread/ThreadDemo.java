package thread;

public class ThreadDemo extends Thread{
	
	@Override
	public void run() {
		System.out.println("Child Thread");
	}
	 public static void main(String[] args) {
		 
		 String a = "Arun";
		  a.concat("Vishwakarma");
		  
		  String b = a;
		  
		  System.out.println(a+""+b);
		ThreadDemo td = new ThreadDemo();
		System.out.println("E");
		td.start();
		td.start();
		System.out.println("main");
	}
	

}
