package comm.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class CopyBytes {
 public static void main(String[] args) throws IOException , FileNotFoundException {
	 
	 
/*	 FileInputStream in = new FileInputStream("in.txt");
	 FileOutputStream out = new FileOutputStream("out.txt");
	 
	 
	 int c;
	 while ((c = in.read()) != -1)
	 {
		
		 	out.write(c);
		 	 System.out.println(c);
      }
	 
   

  
    
    in.close();
    out.close()*/;
    FileReader fr = new FileReader("out.txt");
    BufferedReader br  = new BufferedReader(fr);
    int i;
    while ((i=br.read()) != -1)
    {
    	System.out.print((char)i);
    	
    	
    }
    br.close();
    fr.close();
    
	
}
}
