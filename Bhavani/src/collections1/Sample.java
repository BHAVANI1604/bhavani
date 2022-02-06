package collections1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;
import java.util.stream.Collectors;

public class Sample {

	public static void main(String[] args) {
		ArrayList<String>li=new ArrayList<>();
		li.add("bhavani");
		li.add("satya");
		li.add("ganga");
		li.add("anu");
		System.out.println(li);
	Collection<String>l=li.stream().collect(Collectors.toCollection(LinkedList::new));
System.out.println(l);
Collection<String>l1=li.stream().collect(Collectors.toCollection(Vector::new));
System.out.println(l1);
Collection<String>l2=li.stream().collect(Collectors.toCollection(HashSet::new));
System.out.println(l2);
Collection<String>l3=li.stream().collect(Collectors.toCollection(LinkedHashSet::new));
System.out.println(l3);
Collection<String>l4=li.stream().collect(Collectors.toCollection(TreeSet::new));
System.out.println(l4);
	}

}
