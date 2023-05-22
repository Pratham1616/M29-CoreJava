package org.tnsif.stringsprogram;
import java.util.*;
public class StringMethodProgram {

	public static void main(String[] args) {
		
		String str1 = "Virat";
		System.out.println("Enter the name");
		Scanner sc = new Scanner(System.in);
		String str2 = new String(sc.nextLine());
		
		if(str1.equals(str2)) {
			System.out.println("Both are Equal");
		}
		else {
			System.out.println("Not Equal");
		}

	}

}