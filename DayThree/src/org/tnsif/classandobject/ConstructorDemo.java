//program to demonstrate class, object, cons
package org.tnsif.classandobject;
import java.util.Scanner;
public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int id;
		String name,city;
		System.out.println("Enter the customer id: ");
		id=s.nextInt();
		
		s.nextLine();
		System.out.println("Enter the customer name: ");
		name=s.nextLine();
		System.out.println("Enter the customer city: ");
		city=s.nextLine();
		
		//object creation
		//default constructor invoked
		Customer c=new Customer();
		c.setCustomerId(id);
		c.setCustomerName(name);
		c.setCity(city);
		
		
		//below method we call to call toString() method 
		System.out.println(c);
		
		System.out.println("Enter the customer id: ");
		id=s.nextInt();
		s.nextLine();
		System.out.println("Enter the customer name: ");
		name=s.nextLine();
		System.out.println("Enter the customer city: ");
		city=s.nextLine();
		
		Customer c1=new Customer(id,name,city);
		System.out.println(c1);
		
				
		
		
		

	}

}