//program to demonstrate on heirachical inheritance
//parent class
package org.tnsif.heirachicalinheritance;

public class Android {

	//private data member
	private String brand;
	private String ownerName;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public Android() {
		System.out.println("Default constructor");
		brand="realmie";
		ownerName="Li BingZhong";
	}
	public Android(String brand, String ownerName) {
		super();
		this.brand = brand;
		this.ownerName = ownerName;
	}
	@Override
	public String toString() {
		return "Android [brand=" + brand + ", ownerName=" + ownerName + "]";
	}
	
	

}