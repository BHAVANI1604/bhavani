import java.util.HashMap;
import java.util.HashSet;

public class Sample123 {

	public static void main(String[] args) {
		HashMap<Integer, String>hm=new HashMap<>();
		hm.put(1, "bhavani");
		hm.put(2, "anu");
		System.out.println(hm);
		for(int i=0;i<hm.size();i++) {
			System.out.println(hm.get(i));
		}
		
	}

}
