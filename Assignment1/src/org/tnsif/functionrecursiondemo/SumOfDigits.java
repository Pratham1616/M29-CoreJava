package org.tnsif.functionrecursiondemo;

import java.util.Scanner;

public class SumOfDigits {
	
	public static int sum(int n)
    {
        if (n == 0)
            return 0;
        return (n % 10 + sum(n / 10));
    }
 
  
    public static void main(String args[])
    {
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter the number");
    	int num = s.nextInt();
    	
        int result = sum(num);
        System.out.println("Sum of digits in " + num + " is " + result);
	}

}