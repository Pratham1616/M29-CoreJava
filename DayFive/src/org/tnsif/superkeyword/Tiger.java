package org.tnsif.superkeyword;

public class Tiger extends Animal {
	public String animalType="Tiger-Wild";
	public int noLegs=4;
	
	public void display()
	{
		super.display();
		System.out.println(super.animalType);
		System.out.println(super.noLegs);
		System.out.println("Animal Type"+animalType);
		System.out.println("No of Legs"+noLegs);
	}
	@Override
	public String toString() {
		return "Tiger [animalType=" + animalType + ", noLegs=" + noLegs + "]";
	}

}