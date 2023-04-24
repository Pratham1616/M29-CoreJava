package org.tnsif.singleinheritance;

public class Citizen {
	
	private String name;
	private String adhar_no;
	private String city;
	private long contact;
	
	
	public Citizen() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Citizen(String name, String adhar_no, String city, long contact) {
		super();
		this.name = name;
		this.adhar_no = adhar_no;
		this.city = city;
		this.contact = contact;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAdhar_no() {
		return adhar_no;
	}


	public void setAdhar_no(String adhar_no) {
		this.adhar_no = adhar_no;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public long getContact() {
		return contact;
	}


	public void setContact(long contact) {
		this.contact = contact;
	}


	@Override
	public String toString() {
		return "Citizen [name=" + name + ", adhar_no=" + adhar_no + ", city=" + city + ", contact=" + contact + "]";
	}
	
}