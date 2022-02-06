package examples;

public class Example {

	public static void main(String[] args) {
		int ashok=90;
		int aswin=80;
		int varun=70;
		if(ashok>aswin&&ashok>varun)
		{
			System.out.println("Ashok secured highest mark");
		}
		else if(aswin>varun&&varun<ashok)
		{
			System.out.println("aswin secured highest mark");
		}
		else
			System.out.println("varun secured highest mark");
		
	

}
}