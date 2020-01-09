package comm.examp;


import java.util.Collections;
import java.util.LinkedList;

public class Listcheck {
	
	public static void main(String[] args) {
		LinkedList <String> obj = new LinkedList<String>();
		
		obj.add("hello");
		obj.add("say");
		obj.add("I:");
		
		System.out.println("Linked list :" + obj);
		Collections.sort(obj);
		
		System.out.println ("Sorted list is :" +obj);
		LinkedList<Integer> obj1 = new LinkedList<Integer>();
		obj1.add(10);
		obj1.add(20);
		obj1.add(30);
		obj1.add(200);
		System.out.println(obj1);
		System.out.println(Collections.binarySearch(obj1, 30));
		System.out.println(obj1.get(2));
		
		
		
		
		
		
		
		
		
		
		
	}

}
