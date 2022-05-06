package com.exmpp;

public class HashMapTest {

	static int fibb(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else

			return (fibb(n - 1) + fibb(n - 2));

	}

	static int fact(int n) {
		if (n < 0)
			return -1;
		if (n == 0 || n == 1)
			return n;
		else
			return n * fact(n - 1);
	}

	static int sum(int n) {
		if (n < 0)
			return -1;
		if (n == 0)
			return 0;
		else
			return sum(n / 10) + n % 10;
	}

	static double power(int x, int n) {
		if (x == 0)
			return 0;
		if (n == 0)
			return 1;
		else
			return x * power(x, n - 1);

	}

	static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else
			return gcd(b, a % b);

	}

	static int decToBin(int n) {

		if (n == 0)
			return 0;
		else
			return n % 2 + 10 * decToBin(n / 2);
	}
	
	public static void printNumers(int n) {
		 
		if(n<=0)
			return ;
		else
			
			printNumers(n-1);
		System.out.print(n+" ");
			
		
		
	}
	public static void main(String[] args) {

		HashMapTest t = new HashMapTest();
		System.out.println(fibb(10));
		System.out.println(fact(-4));
		System.out.println(sum(606));
		System.out.println(power(2, 5));
		System.out.println(gcd(44, 33));
		System.out.println(decToBin(32));
		System.out.println(t.reverse("ARUN"));
		HashMapTest.printNumers(10);
	}

	public  String reverse (String a) {
			
			if(a.isEmpty()) {
				return a;
			}
			
			String x= "10039463984276";
			double c = Double.valueOf(x);
			System.out.println(c+1);
			return  reverse(a.substring(1))+a.charAt(0);
			
		}

}
