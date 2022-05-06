package thread;


public class TestDemoInterface implements  DemoInterface {

//	@Override
//	public void shine() {
//		
//		System.out.println("SHINE");
//	}
	
	
//	@Override
//	public void show() {
//		// TODO Auto-generated method stub
//		DemoInterface.super.show();
//	}


	public static void main(String[] args) {
		DemoInterface.print();
		DeoInterface.print();
		
		TestDemoInterface td = new TestDemoInterface();
		DemoInterface demot = new TestDemoInterface();
//		DeoInterface tdeo = new TestDemoInterface();
//		td.shine();
		td.show();
		demot.show();
		
	
//		tdeo.show();
	
	}
	

}
