//program to demons
package org.tnsif.classandobject;

public class Customer {
	
	
	//private data member
	private int customerId;
	private String customerName;
	private String city;

	
	//constructor does not have any return type
	//it is same as classname follwed by '()'
	
	//default constructor
	  public  Customer() {
	      super();
}
	  //parameterized constructor
	  public Customer(int customerId, String customerName, String city ) {
		  super();
		  this.customerId = customerId;
		  this.customerName = customerName;
		  this.city = city;
		  
	  }
	  
	  

//getter and setter method
	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}
	
	
	//object of a class will toString() method
	@Override
	public String toString() {
		return "Customer [getCustomerId()=" + getCustomerId() + ", getCustomerName()=" + getCustomerName()
				+ ", getCity()=" + getCity() + "]";
	}
	

}