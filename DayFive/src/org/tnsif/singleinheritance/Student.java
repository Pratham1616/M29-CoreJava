package org.tnsif.singleinheritance;

public class Student extends Citizen{
	
	private String college;
	private int rollno;
	public Student() {
		super();
		
	}
	public Student(String name, String adhar_no, String city, long contact, String college,int rollno) {
		super(name, adhar_no, city, contact);
		this.college = college;
		this.rollno = rollno;

	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Student [college=" + college + ", rollno=" + rollno + ", getName()=" + getName() + ", getAdhar_no()="
				+ getAdhar_no() + ", getCity()=" + getCity() + ", getContact()=" + getContact() + "]";
	}

}