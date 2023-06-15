package org.tnsif.annotations;

public class DeprecatedAnnotationExample {
	//it allows any elements no longer to be used
	@Deprecated
	public void print() {
		System.out.println("Welcome to Java Annotations");
	}
	public static void main(String[] args) {
		DeprecatedAnnotationExample d = new DeprecatedAnnotationExample();
		d.print();
	}
}