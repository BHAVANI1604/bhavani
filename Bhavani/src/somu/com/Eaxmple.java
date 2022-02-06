package somu.com;

public class Eaxmple {

	public static void main(String[] args) {
		//String[] a=args[0].split(",");
		//for(String a1:a)
		//{
		//	System.out.println(a1);
		//}
		//for(int i=0;i<a.length;i++)
		//{
		//	System.out.println(i);
		//}
		String s1="bha\nvani";
		String s2="bhavani";
		System.out.println(s1+" "+s2);
		String s3="bhavanimklf";
		String s4="bhavanikjkldf;";
		String s=String.join(s3,s4);
		System.out.println(s);
		String s5="chennai is a city";
		System.out.println(s5.contains("is"));
		String s6= "hello"; 
		System.out.println(s6.concat(" java ").concat("programming "));
		String a="hello world";
		System.out.println(a.split(" "));
		
	

	}

}
