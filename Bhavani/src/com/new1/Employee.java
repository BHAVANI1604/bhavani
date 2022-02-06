package com.new1;

public class Employee {
	  int id;
	  String name;
	  Address address;
	  Employee(int id,String name,Address address)
	  {
		  this.id=id;
		  this.name=name;
		  this.address=address;
	  }
	  void show()
	  {
		  System.out.println(id+""+name);
		  System.out.println(address.city+""+address.state);
	  }

	public static void main(String[] args) {
		Address a=new Address("kkd","ptp");
		Employee e=new Employee(1, "ganga", a);
		e.show();

	}

}
