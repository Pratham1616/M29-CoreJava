//program to demonstrate for loop
package org.tnsif.looping;
import java.util.*;
public class ForLoopProgram {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		for(int i = 1; i <= n; i++)
		{
			System.out.println(i + " ");
		}
		

	}

}