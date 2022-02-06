package collections;

import java.util.Comparator;

public class Ganga12 implements Comparator<Arrays>{

	@Override
	public int compare(Arrays o1, Arrays o2) {
		
		return o1.getName().compareTo(o2.getName());
	}


	
}
