import java.util.Comparator;

public class ComparaGanga implements Comparator<Ganga> {

	@Override
	public int compare(Ganga o1, Ganga o2) {
		
		return o1.getEmployee().compareTo(o2.getEmployee());
	}

}
