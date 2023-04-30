//program to demonstrate on interface
package org.tnsif.interfacedemo;

public interface ATMMachine {
	/*all the variable inside an interface are by default public static final
	 * so here amount is final type and it must be initialized*/
	//int amount;
	int amountWithDraw = 1250;
	int amountDeposit = 3000;
	/*by default all the methods inside 
	 * an interface are public abstract*/
	void withdraw();
	void deposit();
}