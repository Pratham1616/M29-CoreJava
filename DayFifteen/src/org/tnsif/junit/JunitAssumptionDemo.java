/*program to demonstrate on Junit assumption method*/
package org.tnsif.junit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
class JunitAssumptionDemo {

	@Test
	void test() {
		Assumptions.assumeTrue(12==12);
	}
	@Test
	void display() {
		Assumptions.assumeFalse(12==12);
	}

}