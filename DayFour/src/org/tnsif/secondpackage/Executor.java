package org.tnsif.secondpackage;
//way to import the another package 
import org.tnsif.firstpackage.*;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b1 = new Base();
		
		/*if any method is default we cannot access into 
		 * another package we can access only inside the same package*/
		//b1.methoddefault();
		
		//public method access anywhere
		b1.methodpublic();
		

	}

}