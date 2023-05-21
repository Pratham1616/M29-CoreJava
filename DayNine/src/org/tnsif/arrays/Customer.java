//customer entity
package org.tnsif.arrays;

public class Customer {
	//private data member
	private int id;
	private String name;
	//constructor
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	//getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}