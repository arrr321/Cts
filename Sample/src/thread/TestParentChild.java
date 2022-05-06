package thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class TestParentChild  {

	public  int[] dupRemove(int[] arr) {
		System.out.println("strt");
		Set<Integer> s = new HashSet<Integer>();
		System.out.println(":");
		Set<Integer> l =new HashSet<Integer>();
		System.out.println("ksj");
		for(int x : arr) {
			if(s.add(x)==false) 
				l.add(x);
				
		
		}
		System.out.println(l);
	int z[]=	l.stream().mapToInt(Integer::intValue).toArray();
	
	return z;
		
		
		
		
	}
	
	public static void main(String[] args) {
//		in
//		Parent p = new Parent();
		Child c = new Child();
		Parent p1 = new Child();
		
//		p.print();
//		p.show();
//		c.print();
//		c.show();
//		Child.print();
//		p1.show();
		
		int [] a = {1,2,3,4,2,3,3,2,4};
		
//		for (int x : a) {
//			System.out.println(x);
//		}
		
		
			Set<Integer> set = new HashSet<Integer>();
			Set<Integer> dup = Arrays.stream(a).filter(x->!set.add(x)).boxed().collect(Collectors.toSet());
			System.out.println("Dups"+dup);
			int duplicateElememts [] = dup.stream().mapToInt(Integer :: intValue).toArray();
			System.out.println("Arrays of Integer :"+Arrays.toString(duplicateElememts));
			int x[] = duplicateElememts;
			System.out.println("duplicates are :"+dup);
		System.out.println(Arrays.toString(x));
		TestParentChild tp = new TestParentChild();
		
		
		      String str = "SSDRRRTTYYTYTR";
		      HashMap <Character, Integer> hMap = new HashMap<>();
		      for (int i = 0; i <str.length(); i++) {
		         if (hMap.containsKey(str.charAt(i))) {
		            int count = hMap.get(str.charAt(i));
		            hMap.put(str.charAt(i), ++count);
		         } else {
		            hMap.put(str.charAt(i),1);
		         }
		      }
		      System.out.println(hMap);
		   
		
		
		
	}
}
