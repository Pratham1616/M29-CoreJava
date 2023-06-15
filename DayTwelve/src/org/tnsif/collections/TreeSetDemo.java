package org.tnsif.collections;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Prathamesh");
		ts.add("Raj");
		ts.add("Iraj");
		ts.add("Krutik");
		ts.add("Rutvij");
		ts.add("Swaraj");
		//ts.add(null); NullPointerException
		System.out.println(ts);
		

	}

}