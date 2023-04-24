package org.tnsif.functionrecursiondemo;

import java.util.*;

public class FibonacciUsingRecursion {
	
	static int fib(int n)
    {
        if (n <= 1)
        	return n;
        return fib(n - 1) + fib(n - 2);
    }
 
    public static void main(String args[])
    {
    	@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
    	System.out.println("Enter the number");
    	int N = s.nextInt();
   
        for (int i = 0; i < N; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}