package com.exmpp;

import java.util.Arrays;

public class TestSample {
	int array[]=null;
	public TestSample (int sizeofArray) {
		 array = new int[sizeofArray];
		for(int i=0 ; i<sizeofArray ; i++) {
			array[i]=Integer.MIN_VALUE;
		}
		
	}
	public void add(int location , int element) {
		try {
	if(array[location] == Integer.MIN_VALUE) {
		array[location]=element;
		System.out.println(Arrays.toString(array));
	}
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception");
		}
	}
	public static void main(String[] args)   {
		TestSample ts = new TestSample(10);
		ts.add(0, 0);
		ts.add(11, 0);
		ts.add(2, 1);
		ts.add(11, 0);
		
		var x = 10;
		System.out.println(x);
		
		
		
		
		
		
		String s ="Hello";
		System.out.println(s.charAt(0));
		
	}
}
