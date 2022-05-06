package thread;

public interface DemoInterface {
	
//	public void shine();
	
	public default void show()
	{
		System.out.println("HiDEMO");
	}
	public static void print() {
		
		System.out.println("HelloDEMO");
	};

	
}
