/*program to demonstrate on nested interface
 * Nested Interface: Inside an interface 
 * there is another interface*/
package org.tnsif.interfacedemo;

public interface OuterInterface {
	int sum();
	interface InnerInterface{
		String concanate();
	}
}