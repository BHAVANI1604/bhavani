package collections;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ganga1234 {
	public static void main(String args[]) {
		Arrays a = new Arrays(101, "Bhavani", "Cse");
		Arrays a1 = new Arrays(102, "Satya", "Ece");
		Arrays a2 = new Arrays(103, " Veera", "EEE");
		Arrays a3 = new Arrays(104, " Siva", "Petrolum");
		ArrayList<Arrays> li = new ArrayList<>();
		ArrayList<Arrays> lis = new ArrayList<>();
		lis.add(a);
		lis.add(a1);
		lis.add(a2);
		lis.add(a3);
		
		li.add(a);
		li.add(a1);

		li.add(a2);
		li.add(a3);
		ArrayList<Arrays> li1 = new ArrayList<>();
		li1.add(a);
		li1.add(a1);
		li1.add(a2);	
		li1.add(a3);
		HashMap<Integer, Arrays> hm = new HashMap<Integer, Arrays>();
		hm.put(1, a);
		hm.put(2, a1);
		hm.put(3, a2);
		hm.put(4, a3);
		System.out.println(hm);
		Map<Integer, Arrays> m = li.stream().collect(Collectors.toMap(Arrays::getId, Function.identity()));
		m.forEach((k, v) -> System.out.println(k + "" + v));
		System.out.println("IgnoreCase");
		System.out.println(hm.entrySet().stream().filter(map -> map.getValue().getName().equalsIgnoreCase("bhavani"))
				.collect(Collectors.toList()));
		System.out.println("------------ComparTo--------------------");
		Collections.sort(li);
		li.forEach(y -> System.out.println(y));
		System.out.println("-------------------Name Compare-----------------");
		Collections.sort(lis, new Ganga12());
		li1.forEach(y -> System.out.println(y));
		System.out.println("---------------------Branch Compare-----------");
		Collections.sort(li1, new Example());
		li1.forEach(z -> System.out.println(z));
	}

}
