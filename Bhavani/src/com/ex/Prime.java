package com.ex;

public class Prime {
	public static void main (String args[]) {
	
		int a=6;
		boolean prime=false;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				prime=true;
				break;
			}
		}
		
		if(prime) {
			System.out.println("NOT PRIME");
		}else {
			System.out.println("prime");
		}
		
		
	}
	

}
