package com.test.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		
		String x = "ABC";
		x.toLowerCase();
		x+="abc";
		System.out.println(x);
		
	
	List<Integer> lst = Arrays.asList(2,2,3,4).stream().map(q->q+1).collect(Collectors.toList());
//	Iterator it = new Iterator<E>() {
//		List<Integer> lst = Arrays.asList(2,2,3,4).stream().map(q->q+1).collect(Collectors.toList());
//		
//	};
//	if(it.hasNext()){
//		System.out.println(lst);
//	}
	
	System.out.println(lst);
	
//	List<Integer> list = Arrays.asList(332,21,1);
//	list.stream().map(a -> a*a).forEach(x -> System.out.println(x));
//	int v = list.stream().filter(x->x%2== 0).reduce(1,Integer :: sum);
//	System.out.println("Name :" +v);
//	
//	
//	list.stream().map(x-> x.toString()).filter(z-> z.startsWith("1")).forEach(System.out::println);
//	System.out.println(list.stream().max(Comparator.naturalOrder()).get());
//
//	}
}
}
