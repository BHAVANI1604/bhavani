package collections1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Sample2 {

	public static void main(String[] args) {
		List<String>li=Arrays.asList("ganga","bhavani","anu","anu","ganga1","bhavani");
		System.out.println(li);
       Set<String>l=li.stream().collect(Collectors.toSet());
       System.out.println(l);
       ArrayList<String>l1=li.stream().collect(Collectors.toCollection(ArrayList::new));
       
       System.out.println(l1);
       LinkedList<String>l2=li.stream().collect(Collectors.toCollection(LinkedList::new));
       System.out.println(l2);
       HashSet<String>l3=li.stream().collect(Collectors.toCollection(HashSet::new));
       System.out.println(l3);
       HashSet<String>l4=li.stream().collect(Collectors.toCollection(HashSet::new));
       System.out.println(l4);	
       List<String>i=Arrays.asList("ganga","bhavani","anu","ganga1","Satya");
       
       
       Map<String, String>l5=i.stream().collect(Collectors.toMap(Function.identity(),String::valueOf));
       System.out.println(l5);
       
  
	}

}
