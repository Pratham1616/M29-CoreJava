package org.tnsif.annotations;
import java.util.Set;
import java.util.TreeSet;
public class SuppressWarningExample {
	/*we can remove warnings by using the below
	 * annotations*/
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Set s = new TreeSet();
		s.add(12);
		s.add(76);
		s.add("Pratham");
		System.out.println(s);
	}

}