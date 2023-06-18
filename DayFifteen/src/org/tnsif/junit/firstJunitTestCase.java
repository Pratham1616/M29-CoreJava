package org.tnsif.junit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
class firstJunitTestCase {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	@DisplayName("SimpleTesting")
	void display()
	{
		System.out.println("First Junit5 Test case");
	}
	

}