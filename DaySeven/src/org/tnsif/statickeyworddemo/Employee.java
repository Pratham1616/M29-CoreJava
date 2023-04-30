//program to demonstrate on static variable
package org.tnsif.statickeyworddemo;

public class Employee {
	//non-static private data members
	private int empID;
	private String empName;
	
	//static data members
	static String companyName = "TNS India Foundation";

	//parameterized constructor
	public Employee(int empID, String empName) {
		super();
		this.empID = empID;
		this.empName = empName;
	}

	//to string method
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + "]";
	}
	
}