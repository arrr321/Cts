package com.exmpp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestSampleCode {
	
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(2);
		l.add(3);
		l.add(5);
		l.add(4);
		l.stream().filter(x->x.equals(5)).map(z->z );
		l.stream().forEach( z-> {
			if(z.equals(5))
				System.out.println("Index of "+z +"::"+l.indexOf(z));
			
			l.stream().filter(x->x.equals(a)).collect(Collectors.toList());
			
	});
		System.out.println(l);
	}

}
