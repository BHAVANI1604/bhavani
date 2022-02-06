import java.util.ArrayList;

public class Sample {

	public static void main(String[] args) {
ArrayList li=new ArrayList<>()	;
li.add(10);
li.add("bhavani");
li.add("Anusuri");
li.add(63038437);
System.out.println(li);
for(Object a:li)
{
	System.out.println(a);
	}
for(Object a1: li)
{
System.out.print("\t"+a1);	
}

	}

}
