import java.util.HashMap;
import java.util.Map.Entry;

public class Map {
	
		public static void main(String args[])
		{
		HashMap<String,String>hm=new HashMap<String,String>();
	hm.put("kakinada" , "Bhavani");
	hm.put("chennai", "bhanu");
	System.out.println(hm);
	System.out.println(hm.keySet());
	System.out.println(hm.values());
	System.out.println(hm.size());
	//java.util.Iterator<String> i=  hm.iterator();
	//while(i.hasNext())
//		System.out.println(i.next()+ "");
	hm.forEach((k,v)->System.out.println(  k + " " + v));
	hm.forEach((k,v)->System.out.println(hm));
	for(Entry<String, String> s:hm.entrySet())
	{
	System.out.println(s.getKey()+ "   "+s.getValue() );
		}
		}
	}

