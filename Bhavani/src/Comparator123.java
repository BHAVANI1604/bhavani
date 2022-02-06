import java.util.Comparator;

public class Comparator123 implements Comparator<Comparator1> {

	public int compare(Comparator1 o1, Comparator1 o2) {
		
		return  o1.getStrength()- o2.getStrength();
	}

}
