//Program to demonstrate packaging and access specifier
package org.tnsif.firstpackage;

public class Base {
	
	//declaring all the access specifier with variable
	int vardefault=10;
	public String varpublic="John";
	private int varprivate=1345;
	protected float varprotected=3400.45f;
	
	
	/*declaring all the access specifier with variable*/
	void methoddefault() {
		System.out.println("Default acces method:" +vardefault );
	}
	public void methodpublic() {
		System.out.println("Default acces method:" +varpublic );
	}
	void methodprivate() {
		System.out.println("Default acces method:" +varprivate );
	}
	void methodprotected() {
		System.out.println("Default acces method:" +varprotected );
	}
}