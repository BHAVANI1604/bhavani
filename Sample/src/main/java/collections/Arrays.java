package collections;

public class Arrays implements Comparable<Arrays> {
	private int id;
	private String name;
	private String branch;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Arrays [id=" + id + ", name=" + name + ", branch=" + branch + "]";
	}
	public Arrays(int id, String name, String branch) {
		
		this.id = id;
		this.name = name;
		this.branch = branch;
	}
	public int compareTo(Arrays o) {
		// TODO Auto-generated method stub
		return this.id-o.getId();
	}
	
	
}
