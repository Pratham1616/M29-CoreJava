/*program to demonstrate on 
 * static block and static method*/
package org.tnsif.statickeyworddemo;

public class Customer {
	//non-static data member
	private int custId;
	
	//static data member
	private static String companyName;
	
	//static block
	/*used to initialize static variable*/
	 
	static {
		/*can't be used to initialize non static variable*/
		//name = "Prathamesh";
		companyName = "Myntra";
	}
	
	public Customer() {
		System.out.println("Default Constructor");
		custId++;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + "]";
	}

	static void display() {
		//non static variable can't be used in static method
		System.out.println("Company Name: " + companyName);
	}
	
	
}