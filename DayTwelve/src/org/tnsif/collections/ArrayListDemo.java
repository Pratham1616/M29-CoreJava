package org.tnsif.collections;

import java.util.ArrayList;

import org.tnsif.threading.Person;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList list=new ArrayList(); //Raw list - Heterogenous
		list.add(10);
		list.add(40);
		list.add(34.78);
		list.add(3400888l);
		list.add(true);
		list.add('A');
		list.add("Mumbai");
		Person p=new Person(1, "niket");
		p.setId(101);
		p.setName("Prabal");
		list.add(p);
		System.out.println(list);
		ArrayList<String> list1=new ArrayList<String>(); //Homogenous
		list1.add("Niket");
		list1.add("Nikhil");
		list1.add("Aniket");
	//	list1.add(true);
	}
}