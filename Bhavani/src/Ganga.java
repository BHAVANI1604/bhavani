
public class Ganga implements Comparable<Ganga> {
	
	private int empId;
	private String employee;
	private String place;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmployee() {
		return employee;
	}
	public void setEmployee(String employee) {
		this.employee = employee;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public int compareTo(Ganga o) {
		
		return this.empId-o.empId;
	}
	
	

}
