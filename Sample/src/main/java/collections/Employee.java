package collections;

public class Employee implements Comparable<Employee> {
	private String empName;
	private int empId;
	private String city;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public int compareTo(Employee o) {
		
		return this.empId-o.empId;
	}
	
	
	

}
