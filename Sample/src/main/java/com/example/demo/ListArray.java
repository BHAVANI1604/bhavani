package com.example.demo;


import java.util.*;

public class ListArray {
public static void main(String args[])
{
	ArrayList<Integer> li=new ArrayList<>();
	li.add(10);
	li.add(20);
	li.add(30);
	System.out.println(li);
	for(int i=0;i<li.size();i++)
	{
		System.out.println(li.get(i));
	}
	for(int li1:li)
	{
		System.out.println(li);
	}
	
	Iterator<Integer> r =  li.iterator();
	while(r.hasNext())
		System.out.println(r.next() + "");
	li.forEach((a)->{System.out.println(li);});
	int val=0;
	while(li.size()>val) {
	
		System.out.println(li.get(val));
		val++;
	}
	System.out.println("Expression");
	li.forEach(a->System.out.println(li));
	
			}
}