package com.ex;

import java.time.LocalDate;

public class Date {
	public static void main(String args[]) {
		LocalDate l1=LocalDate.now();
	LocalDate yes =l1.plusDays(2);
	
	System.out.println(l1);
	System.out.println(yes);

}
}