
public class Comparator1 implements Comparable<Comparator1>{
	
	private int collegecode;
	private String collegename;
	private int strength;
	//Comparator1() {
	//}
	
	public int getCollegecode() {
		return collegecode;
	}
	public void setCollegecode(int collegecode) {
		this.collegecode = collegecode;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public Comparator1(int collegecode, String collegename, int strength) {
		//super();
		this.collegecode = collegecode;
		this.collegename = collegename;
		this.strength = strength;
	}
	@Override
	public String toString() {
		return "Comparator1 [collegecode=" + collegecode + ", collegename=" + collegename + ", strength=" + strength
				+ "]";
	}
	@Override
	public int compareTo(Comparator1 o) {
		
		return this.collegecode-o.getCollegecode() ;
	}
	


}

