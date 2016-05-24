***********************************

import java.lang.Math; // header stuff MUST go above the first class
import java.util.*;

public class lecture5Assignment3 {
  public static void main(String[] args)
  {
    String str = "Hadoop is open source frame work ,Hadoop is good framework for handling big data";
		String[] tempStr = str.split(" "); 
    
		System.out.println(tempStr);
		
		int count = 0;
		for (String s: tempStr) {           
        
          	if(s.equals("Hadoop")) {
        		count++;
        	}
       	}
		System.out.println("Count number of occurrence of word Hadoop in the given string = " + count);	
    
    	String newStr =str.replace(","," ");
     
    	System.out.println("String after replacing ',' with space - "+ newStr);
        	
	   	ArrayList<String> al = new ArrayList<String>();
    	
    	for (String s: tempStr) {           
        
        	al.add(s);
       	}
    
    	System.out.println("Contents of a1: " + al);
  }
}
