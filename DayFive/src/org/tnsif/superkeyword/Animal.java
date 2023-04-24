package org.tnsif.superkeyword;

public class Animal {
	public String animalType;
	public int noLegs;
	
	public void display()
	{
		System.out.println("Animal Type"+animalType);
		System.out.println("No of Legs"+noLegs);
	}

	@Override
	public String toString() {
		return "Animal [animalType=" + animalType + ", noLegs=" + noLegs + "]";
	}

}