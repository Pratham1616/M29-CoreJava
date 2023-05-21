//program to demonstrate on array object class
package org.tnsif.arrays;

public class ArrayOfObjectsDemo {

	public static void main(String[] args) {
		//array of customer class
		Customer[] arr = new Customer[2];
		arr[0] = new Customer(23456, "Rutvij");
		arr[1] = new Customer(78566, "Novina");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getId() + " " + arr[i].getName());
		}
	}

}