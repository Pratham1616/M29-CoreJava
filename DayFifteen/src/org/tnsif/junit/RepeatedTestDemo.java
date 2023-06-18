package org.tnsif.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class RepeatedTestDemo {

	@RepeatedTest(3)
	void test() 
	{
		int i=1;
		System.out.println("Hello " + i);
		i++;
	}

}