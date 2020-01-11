package comm.example;

import java.io.File;

public class Temp {
public static void main(String[] args) {
	System.out.println("CReating");
	 String fileName = "empp";
     File fn = new File(fileName);
     fn.mkdir();
     System.out.println("created");
     
     
}
}
