package org.tnsif.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("Pratham");
		lhs.add("Raj");
		lhs.add("Swaraj");
		lhs.add("Laukik");
		lhs.add("Yatish");
		lhs.add("Valay");
		lhs.add(null);
		System.out.println(lhs);
		
		

	}

}