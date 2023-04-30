package org.tnsif.finalkeyword;

public class FinalMethodChildClass extends FinalMethod{
	// public int salary = 27000;
	// final method can't be overriden
	// final void show(){
	//	System.out.println("Salary is " + salary);
	//}
	final void show(int num) {
		System.out.println(salary);
	}
}