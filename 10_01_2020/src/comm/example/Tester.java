package comm.example;

import java.util.Set;
import java.util.TreeSet;

public class Tester {
	public static void main(String[] args) {
		Set<Student> set = new TreeSet<Student>();
		set.add(new Student("Johnrttyuyuy", "Doe", 100,0.5));
		set.add(new Student("Shane", "Warne", 110,3.0));
		for (Student s : set) {
			System.out.println(s + "\n");
		}

	}

		
		
		
		
		
	}


