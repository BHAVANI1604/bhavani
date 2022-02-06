import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Shiva2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator1 cc1 = new Comparator1(100, "Shiva", 3000);
		Comparator1 cc2 = new Comparator1(101, "Bhavani", 3500);
		Comparator1 cc3 = new Comparator1(102, "Ganga", 5000);

		List<Comparator1> lists = new ArrayList<>();
		lists.add(cc1);
		lists.add(cc2);
		lists.add(cc3);

		List<Comparator1> cp = new ArrayList<>();
		cp.add(cc1);
		cp.add(cc2);
		cp.add(cc3);

		Map<Integer, Comparator1> li = new HashMap<Integer, Comparator1>();
		li.put(1, cc1);
		li.put(2, cc2);
		li.put(3, cc3);
		System.out.println(li);

		li.forEach((k, v) -> System.out.println(k + " " + v));

		// Map<Integer, Comparator1>
		// mpsList=lists.stream().Collect(Collectors.toMap(Shiva2::getCollegecode,
		// Shiva2::getCollegename));
		System.out.println("Convert List to Map");

		Map<String, Comparator1> mpsList = lists.stream()
				.collect(Collectors.toMap(Comparator1::getCollegename, Function.identity()));
		mpsList.forEach((k, v) -> System.out.println(k + " " + v));

		System.out.println(li.entrySet().stream()
				.filter(map -> map.getValue().getCollegename().equalsIgnoreCase("shiva")).collect(Collectors.toList()));

		List<Ganga> gList = new ArrayList<>();
		Ganga g = new Ganga();
		g.setEmpId(101);
		g.setEmployee("Raju");
		g.setPlace("Chennai");
		gList.add(g);
		Ganga g1 = new Ganga();
		g1.setEmpId(121);
		g1.setEmployee("Bavani");
		g1.setPlace("Andhira");
		gList.add(g1);

		Ganga g2 = new Ganga();
		g2.setEmpId(99);
		g2.setEmployee("Ganga");
		g2.setPlace("Tiruppathi");
		gList.add(g2);

		Ganga g3 = new Ganga();
		g3.setEmpId(111);
		g3.setEmployee("Anandh");
		g3.setPlace("Kancheepuram");
		gList.add(g3);
		System.out.println("___________Insertion Order_______________");
		for (Ganga t : gList) {
			System.out.println(t.getEmpId() + " " + t.getEmployee() + " " + t.getPlace());
		}

		System.out.println("____________CompareTo______________");
		  Collections.sort(gList);
		  
		  for(Ganga r:gList) {
		  System.out.println(r.getEmpId()+" "+r.getEmployee()+" "+r.getPlace()); }
		 
		System.out.println("___________Compare By Name_______________");
		Collections.sort(gList, new ComparaGanga());

		for (Ganga r : gList) {
			System.out.println(r.getEmpId() + " " + r.getEmployee() + " " + r.getPlace());
		}
		System.out.println("___________Compare By Place_______________");
		Collections.sort(gList, new ComparaPlace());

		for (Ganga r : gList) {
			System.out.println(r.getEmpId() + " " + r.getEmployee() + " " + r.getPlace());
		}

	}

}
