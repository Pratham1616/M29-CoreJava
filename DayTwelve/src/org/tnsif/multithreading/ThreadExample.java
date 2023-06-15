//program to demonstrate on Multithreading
package org.tnsif.multithreading;

public class ThreadExample {

	public static void main(String[] args) {
		//Returns a reference to the currently executing thread object.
		Thread t = Thread.currentThread();
		System.out.println("Current Thread " + t);
	}

}