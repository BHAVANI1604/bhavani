package com.ex;

public class Sample2 {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=0 ;
		int series=10;
		System.out.println(a);
		System.out.println(+b);
		for(int i=0;i<=series;i++)
		{
			c=a+b;
			
			a=b;
			b=c;
			System.out.println(c);
			
		}
		
		
	}

}
