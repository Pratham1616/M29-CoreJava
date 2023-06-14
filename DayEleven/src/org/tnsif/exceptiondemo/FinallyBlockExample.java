//program to demonstrate on when finally block is not executed
package org.tnsif.exceptiondemo;

public class FinallyBlockExample {

	public static void main(String[] args) {
		//array declaration and initialization
		int arr[] = new int[] {101, 33,78};
		System.out.println("Array is: ");
		try {
			System.out.println(arr[3]);
		}
		catch(Exception e) {
			System.out.println("Exception handled: " + e);
			/*1. when we call System.exit(0) it means no any further
			 * statement is executed*/
			//System.exit(0);
		}
		finally {
			/*finally block has code containing exception*/
			System.out.println(3/10);
			System.out.println("Finally block");
		}
	}

}