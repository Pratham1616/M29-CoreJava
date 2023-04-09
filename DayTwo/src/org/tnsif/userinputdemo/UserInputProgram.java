//program to demonstrate on user input
package org.tnsif.userinputdemo;

import java.util.*;

public class UserInputProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your salary");
		float salary = sc.nextFloat();
		
		System.out.println("Enter your Name");
		String Name = sc.next();
		sc.nextLine();
		
		System.out.println("Enter your Name");
		String Name1 = sc.nextLine();
		
		System.out.println("Enter your charcater");
		char ch = sc.next().charAt(0);
		
		System.out.println("Salary is " + salary);
		System.out.println("Name is " + Name);
		System.out.println("Name1 is " + Name1);
		System.out.println("Name1 is " + ch);
		
		sc.close();

	}

}