package Java8Interface;

import java.util.Arrays;

public class Test implements DefInterface {
	
	@Override
	public void print() {
		System.out.println("Overridden ::");
	}
	public void show() {
		System.out.println("OverRidden");
	}
	
	public static void main(String[] args) {
		Test tst = new Test();
		tst.print();
		tst.show();
		DefInterface.show();
//		tst.info(9);
//		new Test().info(5);
//		new Test().info(0);
		Date
		int i=1;
		int j=i++;
		System.out.println(i +">>>>"+j);
//		var j=0;
//		System.out.println(j);
//		j++;
//		System.out.println(j);
//		System.out.println(j);
//		++j;
//		System.out.println(j);
		for(int x =0 ; x <10 ;++x)
			System.out.println(x);
		
		int a[] = {1,2,3,5,4};
		for (int k : a) {
			
		
			System.out.println(k+10);
		}
	}
	
	
//	public void info(int x) {
//		if(x<10) {
//			System.out.println("If");
//			return ;
//			
//		}else
//			System.out.println("done");
//	}
	
}
