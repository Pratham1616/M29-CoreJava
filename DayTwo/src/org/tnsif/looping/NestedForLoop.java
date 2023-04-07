package org.tnsif.looping;

public class NestedForLoop {

	public static void main(String[] args) {
		
		int rows = 4, colums = 4;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1; j <= colums;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}