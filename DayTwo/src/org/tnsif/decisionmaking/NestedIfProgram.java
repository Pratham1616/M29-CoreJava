package org.tnsif.decisionmaking;
import java.util.*;
public class NestedIfProgram {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		if (num > 0) {
			
			if(num < 0) {
				System.out.println("Non zero number");
			}
			else {
				System.out.println("Zero or non zero");
			}			
		}
		else {
			System.out.println("either non zero or zero");
		}
	}

}