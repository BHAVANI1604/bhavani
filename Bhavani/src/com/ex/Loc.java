package com.ex;

import java.time.LocalDate;

public class Loc {

	public static void main(String[] args) {
		LocalDate l= LocalDate.now();
		System.out.println(l);
		LocalDate yes=l.plusDays(2);
		System.out.println(yes);
		LocalDate yes1=l.plusDays(10);
		System.out.println(yes1);

	}

}
