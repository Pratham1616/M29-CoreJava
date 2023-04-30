//driver class
package org.tnsif.statickeyworddemo;

public class StaticKeywordExecutor {

	public static void main(String[] args) {
		/*without creating the object we will 
		 * get the value for static variable*/
		System.out.println(Employee.companyName);
		Employee e = new Employee(101, "Abhinav R");
		System.out.println(e);
		Employee e1 = new Employee(102, "Prathamesh P");
		System.out.println(e1);
		
		//without creating the object we can call static method
		Customer.display();
		Customer c = new Customer();
		System.out.println(c);
	}

}