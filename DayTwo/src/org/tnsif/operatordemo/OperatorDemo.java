//program to demonstrate on Arithmetic Operator
package org.tnsif.operatordemo;

import java.util.*;

public class OperatorDemo {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x and y");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println("The Addition of two numbers " + (x + y));
		System.out.println("The Subtarction of two numbers " + (x - y));
		System.out.println("The Muitiplication of two numbers " + (x * y));
		System.out.println("The Division of two numbers " + (x / y));
		System.out.println("The Module of two numbers " + (x % y));
		

	}

}