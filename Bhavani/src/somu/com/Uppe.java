package somu.com;

public class Uppe {

	public static void main(String[] args) {
		String s="chennai is the capital ";
		String s2=s.substring(0,1).toUpperCase()+s.substring(1);
		System.out.println(s2);
		String s3=s.substring(1, 4).toUpperCase()+s.substring(4);
		System.out.println(s3);
		
		String s1="welcome to split world";  
		System.out.println("returning words:");  
		for(String w:s1.split("\\s",2)){  
		System.out.println(w);  
		} 
	}

}
