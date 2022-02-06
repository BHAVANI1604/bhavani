package com.new1;

public class Copy {
	int length;
	int breadth;
	Copy(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
    Copy(Copy c)
    {
    	this.breadth=c.breadth;
    	this.length=c.length;
    }
    int area()
    {
		return length*breadth;
    	
    }
    public String toString()
    {
		return length+  "   length   "   +breadth  +"   breadth   ";
    	
    }
    public static void main(String[] args) {
    	
		Copy c1=new Copy(10,20);
		Copy c2=new Copy(c1);
		System.out.println(c2);
		System.out.println(c1);
		System.out.println(c2.area());
		System.out.println(c1.area());
	}
}
