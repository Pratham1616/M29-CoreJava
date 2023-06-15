//Program to demonstrate on Thread Life Cycle
package org.tnsif.multithreading;

public class Threadlifecycleexample extends Thread{
	
	public void run()
	{
		System.out.println("Is Thread Alive? " + this.isAlive());
		int x=0;
		while(x<3)
		{
			x++;
			System.out.println("X is: " + x);
		}
		
		try {
			sleep(500);
			System.out.println("Is thread alive for sleep: " + this.isAlive());
		}
		catch (InterruptedException e) {
			System.out.println("Thread interruped....");
		}
	}
	
	
	public static void main(String[] args) {
		
		Threadlifecycleexample t = new Threadlifecycleexample();
		System.out.println("Before starting a thread: Is Thread alive?: " + t.isAlive());
		t.start();
		

	}

}