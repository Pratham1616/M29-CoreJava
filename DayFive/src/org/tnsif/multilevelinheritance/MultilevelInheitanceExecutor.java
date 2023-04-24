package org.tnsif.multilevelinheritance;

public class MultilevelInheitanceExecutor {
	public static void main (String[] args) {
		City c=new City();
		c.setCityName("pune");
		c.setArea("pune");
		c.setStateName("Maharashtra");
		c.setLanguage("Marathi");
		c.setCountryName("india");
		c.setCountryCapital("delhi");
		System.out.println(c);
	}

}