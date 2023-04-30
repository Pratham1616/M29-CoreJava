//driver class
package org.tnsif.interfacedemo;

public class InterfaceExecutor {

	public static void main(String[] args) {
		//we can't instantiate any interface
		//ATMMachine a = new ATMMachine();
		
		ATMMachine a1 = new ATMMachineChild();
		a1.deposit();
		a1.withdraw();

		RecipeImplementable r = new RecipeImplementable();
		r.setName("C2TC Program");
		System.out.println(r.displayName());
		
		NestedInterfaceExample n = new NestedInterfaceExample();
		n.setStr1("Prathamesh");
		n.setStr2("Patil");
		System.out.println(n.concanate());
	}

}