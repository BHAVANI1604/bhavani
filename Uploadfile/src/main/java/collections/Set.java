package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Set {
	
	public static void main(String args[]) throws InterruptedException{            
		 
	     
	     List<String> teams = Arrays.asList("India" , "Australia" , "England", "Pakistan");
	   
	     System.out.println("Original List: " + teams);
	   
	     // copying contents from List to Set in Java,
	     // remember this will remove duplicates from
	     // collection because List supports duplicates but

	     //Set does not support duplicates in Java
	   
	     HashSet<String>s = new HashSet<String>(teams);
	   
	     System.out.println("Copy collection :" + s);
	   
	     
	    }  
	 
	}


