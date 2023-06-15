/*program to demonstrate on Junit assertions methods*/
package org.tnsif.junit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class JunitAssertionDemo {
	
	@Test
	void test()
	{
		/*Fails if expression is not true*/
		assertTrue(10>5);
	}
	@Test
	void display()
	{
		/*Fails when expression is not false*/
		assertFalse(10>5);
	}
	@Test
	void accept()
	{
		/*Fails when actual is not null*/
		assertNull(null);
	}
	
	

}