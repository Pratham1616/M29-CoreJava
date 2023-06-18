package org.tnsif.junit;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class JunitAnnotationDemo {

	@Test
	@DisplayName("SimpleTesting")
	void display()
	{
		System.out.println("First Junit5 Test case");
	}
	
	@Test
	@BeforeAll
	void print()
	{
		System.out.println("Performing BeforeAll Annotation");
	}
	
	@Test
	@AfterEach
	@Disabled
	void accept()
	{
		System.out.println("AfterEach method is executed");
	}

}