package collections;

import java.util.Comparator;

public class Example implements Comparator<Arrays>{

	@Override
	public int compare(Arrays o1, Arrays o2) {
		
		return o1.getBranch().compareTo(o2.getBranch());                                                                                                                                                                                                      
	}

}
