package org.tnsif.junit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
class ParameterizedTestDemo {

	/*to perform paramterized test*/
	@ParameterizedTest
	@ValueSource(strings= {"Abhinav","Ankita","Parag"})
	void test() {
		System.out.println("Demonstration on Parameterized"
				+ "Test");
	}
	
	@ParameterizedTest
	@ValueSource(strings= {"Sandhya","Yatish"})
	void accept(String str) {
		assertNotNull(str);
	}

}