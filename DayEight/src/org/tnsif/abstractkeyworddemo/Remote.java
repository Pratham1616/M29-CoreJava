//program to demonstrate on abstract class and abstract method
package org.tnsif.abstractkeyworddemo;

/* if any class contains atleast one abstract method make it abstract*/
public abstract class Remote {
	
	public String cellName;
	/*abstract class can contain abstract and
	 * non abstract i.e. concrete methods*/
	
	//abstract method
	abstract void functionRemote();
	abstract void create();
	
	//concrete method
	void display() {
		System.out.println("Cell Name is: " + cellName);
	}
	
}

//implementable class
class RemoteChild extends Remote{
	
	@Override
	void functionRemote() {
		System.out.println("Abstract method is implemented");
	}
	
	/*implement all abstract method of your abstract class in implementable class*/
	@Override
	void create() {
		System.out.println("Abstract method - 2");
	}
}