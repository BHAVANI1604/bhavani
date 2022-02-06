package com.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class Coll {

	public static void main(String[] args) {
		ArrayList <String>l1=new ArrayList<String>();
		l1.add("ONE");
		l1.add("Soft");
		l1.add("Chennai");
		l1.add("HYdrabad");
		System.out.println(l1);
		//HashSet<String>h1=new HashSet<String>(l1);
	//	h1.forEach(a->System.out.println(a));
		HashSet s=new HashSet<>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		System.out.println(s);
		ArrayList<Integer>li=new ArrayList<>(s);
		li.forEach(a->System.out.println(a));
		
		
		
		System.out.println("------list iterator----------");
		
		ListIterator<String> a = l1.listIterator();

    
    while (a.hasNext()) {
        System.out.println(a.next());
    }
    
    System.out.println("Iterating using Enumeration ");
		 
		Enumeration<String> e=Collections.enumeration(l1);
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		System.out.println("-----------using iterator---------------");
		Iterator i=l1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		

	}

}
