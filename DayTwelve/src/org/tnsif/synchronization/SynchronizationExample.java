package org.tnsif.synchronization;

public class SynchronizationExample {

	public static void main(String[] args) {
		
		Power obj = new Power();
		ThreadOne t1=new ThreadOne(obj);
		Threadtwo t2=new Threadtwo(obj);
		t1.start();
		t2.start();

	}

}