package somu.com;

import java.util.Scanner;

public class Exam {
	static void reverseString(char[] na, int le)
	{
		if(le>0) {
			System.out.println(na[le-1]);
			le--;
				reverseString(na,le);
			}
		}
		public static void main(String args) {
			Scanner s=new Scanner(System.in);
			System.out.println("enter a string");
			String name=s.next();
			char[] nam=name.toCharArray();
			int len=nam.length;
			reverseString(nam,len);
			
		}
	}


