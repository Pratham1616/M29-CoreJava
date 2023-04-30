//program to demonstrate on functional interface
/*Functional Interface: It is a interface that 
 * contains exactly one abstract method*/
package org.tnsif.interfacedemo;

//below annotation tell us that interface must have one abstract method
@FunctionalInterface
public interface Recipe {
	/*by default all method inside an 
	 * interface are public abstract and variable are 
	 * public static final*/
	
	//abstract method
	String displayName();
	
	//String print();
}