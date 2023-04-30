package org.tnsif.abstractkeyworddemo;

public class AbstractExecutor {

	public static void main(String[] args) {
		/*if any class contains abstract method,
		 * we can't instantiate that class*/
		//Remote r = new Remote();
		
		RemoteChild r = new RemoteChild();
		r.cellName = "Duracell";
		r.display();
		r.functionRemote();
		r.create();
		
		RemoteChild r1 = new RemoteChild();
		r1.cellName = "Cello";
		r1.display();
		r1.functionRemote();
		r.create();
	}

}