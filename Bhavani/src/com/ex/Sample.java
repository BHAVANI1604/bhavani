package com.ex;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        
         int a=scan.nextInt();
        double b=scan.nextDouble();
        
        
         scan.next();
        System.out.println(a);
        System.out.println(b);
        
        System.out.println(s.concat("is the best place to learn and practice coding!"));
        
        scan.close();
    }
}


