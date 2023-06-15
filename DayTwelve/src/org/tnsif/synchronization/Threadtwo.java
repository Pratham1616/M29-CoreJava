package org.tnsif.synchronization;

public class Threadtwo extends Thread{
	
	Power p;

	public Threadtwo(Power p) {
		super();
		this.p = p;
	}

	public void run()
	{
		p.printPower(3);
	}
}