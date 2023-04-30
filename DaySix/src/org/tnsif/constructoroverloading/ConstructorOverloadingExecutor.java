package org.tnsif.constructoroverloading;

public class ConstructorOverloadingExecutor {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ConstructorOverloadingExample c1 = new ConstructorOverloadingExample();
		ConstructorOverloadingExample c2 = new ConstructorOverloadingExample(12);
		ConstructorOverloadingExample c3 = new ConstructorOverloadingExample(12,13);

	}

}