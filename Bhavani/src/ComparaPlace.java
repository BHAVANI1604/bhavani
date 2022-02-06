	import java.util.Comparator;

public class ComparaPlace implements Comparator<Ganga> {

	@Override
	public int compare(Ganga o1, Ganga o2) {
		
		return o1.getPlace().compareTo(o2.getPlace());
	}

}
