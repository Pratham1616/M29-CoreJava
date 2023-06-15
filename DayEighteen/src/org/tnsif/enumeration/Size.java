//enum can be implemented in interface
package org.tnsif.enumeration;

public enum Size implements Pizza{
	
	SMALL,MEDIUM,LARGE;

	@Override
	public void displaySize() {
		
		System.out.println("Size: " + this);
		
	}

}