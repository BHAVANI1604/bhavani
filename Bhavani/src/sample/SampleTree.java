package sample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class SampleTree {

	public static void main(String[] args) {
		HashMap<String,String>hm=new HashMap<String,String>();
		hm.put("kakinada" , "Bhavani");
		hm.put("chennai", "bhanu");
		System.out.println(hm);
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.size());
		System.out.println("---------------iterator ----------------");
	Iterator<Entry<String, String>> i=    hm.entrySet().iterator();
		while(i.hasNext())
			System.out.println(i.next()+ "");
		System.out.println("---------------lambda-------------------");
		hm.forEach((k,v)->System.out.println(  k + " " + v));
		hm.forEach((k,v)->System.out.println(hm));
		for(Entry s:hm.entrySet())
		{
		System.out.println(s.getKey()+ "   "+s.getValue() );
			}
			}
}
