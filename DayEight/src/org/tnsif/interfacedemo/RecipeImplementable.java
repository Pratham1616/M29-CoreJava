//program to demonstrate on functional interface
package org.tnsif.interfacedemo;

//implementable class
public class RecipeImplementable implements Recipe{

	private String name;
	@Override
	public String displayName() {
		
		return "Welcome To " + name;
	}
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}