package org.tnsif.junit;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class JunitAssertionDemo {
	
	@Test
	void test()
	{
		assertTrue(10>5);
	}
	
	@Test
	void display()
	{
		assertFalse(10>5);
	}
	
	@Test
	void accept()
	{
		assertNull(null);
	}

}