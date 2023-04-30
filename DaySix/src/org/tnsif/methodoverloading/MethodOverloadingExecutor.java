//driver class
//program to demonstrate on method overloading
package org.tnsif.methodoverloading;

public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		MethodOverloadingExample m1 = new MethodOverloadingExample();
		System.out.println(m1.multiplication(12.5f,3.0f));
		System.out.println(m1.multiplication(2, 7));
		System.out.println(m1.multiplication(5, 15.2f));
		System.out.println(m1.multiplication(15.4f, 4));
		System.out.println(m1.print("Welcome to C2TC"));
		System.out.println(m1.print("Kinnari", "Nilesh Patil"));
	}

}