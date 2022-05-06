package thread;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class Lambdas {

	public static void print() {
		System.out.println("Hello Overridden!!");
		
	}
	public static void main(String[] args) {

		DemoInterface d = () -> {
			System.out.println("Hey");
		};

		DemoInterface d1 = () -> {
			System.out.println("give");
		};
		d.show();
		d1.show();
		Lambdas l = new Lambdas();
		DemoInterface.print();
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.addAll(Arrays.asList(1,7,5,2,3,4,5,5));
		System.out.println(hs);
		System.out.println(hs.contains(11));
		hs.remove(3);
		System.out.println(hs);
		
		

	}
}
