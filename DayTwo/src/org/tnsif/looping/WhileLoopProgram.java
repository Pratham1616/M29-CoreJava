package org.tnsif.looping;

import java.util.Scanner;

public class WhileLoopProgram {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		int i = 1;
		while( i <= n)
		{
			System.out.println(i + " ");
			i++;
		}

	}
  
}