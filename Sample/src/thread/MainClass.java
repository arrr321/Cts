package thread;

import java.time.LocalDate;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.function.IntPredicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class MainClass {
	public List<Integer> addName(List<Integer> lst){
		
		return Arrays.asList(1,2);
	}
	
	List<Integer> li = new ArrayList<Integer>();
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return new Integer(0);
	}
	public static void main(String[] args) {
		
		
		ThreadDemo threadDemo = new ThreadDemo();
		threadDemo.start();
		
		Map m = new HashMap();
		m.put("S", 1);
		m.put("S",1);
		m.put("S", 2);
		
		System.out.println(m.size());
		
		System.out.println(m);
		
		System.out.println(LocalDate.now());
		System.out.println(LocalDate.MAX);
		System.out.println(LocalDateTime.MAX);
		System.out.println(LocalDateTime.now());
		
		String s = "My name is ar is name";
		String [] a = {"is", "name"};
		String z = null;
		for(int i =0 ; i<a.length;i++) {
		s.replaceAll(a[i], "");
			
		}
		System.out.println("======"+a.toString());
		
//		System.out.println(s);
//		String [] st = s.split("/");
//		System.out.println(Arrays.toString(st));
		
		Random r = new Random();
		int x = r.nextInt();
		System.out.println(x);
		
		
		
		
		
		
		
		List<Integer> li = new ArrayList<Integer>();
		li.add(1);
		li.add(2);
		MainClass mn = new MainClass();
//		Arrays.stream().peek(mn -> mn.addName(li)).Collectors.toList()).forEach(System.out::println);
		List<Integer> intList = li.stream().map(num-> num*2).collect(Collectors.toList());
		List<String> lst = Arrays.asList("name" , "hey");
//		lst.stream().forEach(x->{
//			if("a" == x.charAt(0)
//					
//		});;
		
		System.out.println(intList);
		List<Integer> lo = new ArrayList<Integer>();
		lo.add(5);
		List<List<Integer>> l = new ArrayList<List<Integer>>();
		l.add(li);
		l.add(lo);
		System.out.println(l);
		Optional<Integer> a2 = Stream.of(1,2,3).max(Comparator.comparing(Integer :: valueOf));
		int sl =Stream.of(1,60,4,5,6,4,4,8).max(Comparator.naturalOrder()).get();
		System.out.println("max is :" +a2);
		System.out.println("max is :::" +sl);
		List<Integer> lst2 = l.stream().flatMap(List-> List.stream()).collect(Collectors.toList());
		
		System.out.println(lst2);
		
		
	
		
		
	
		
		
		
//		Date d = new Date();
//		d.getDate();
//		System.out.println(d.compareTo(d));
		
		
		
		
		
		List<Integer> ls =  Arrays.asList(1000,100000,1028201,19288,129819,36383,1010101);
		Collections.sort(ls , Collections.reverseOrder());
//		List<Integer> a =	ls.stream().limit(5).collect(Collectors.toList());
		
		System.out.println(a);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
