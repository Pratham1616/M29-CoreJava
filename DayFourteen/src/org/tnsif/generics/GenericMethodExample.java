//program to demonstrate on Generic Method
package org.tnsif.generics;
class GenericMethod
{
	//generic method
	public <E> void print(E[] arr1)
	{
		for(E itr:arr1)
		{
			System.out.print(itr+" ");
		}
		System.out.println();
	}
}

//driver class
public class GenericMethodExample {

	public static void main(String[] args) {
		
		GenericMethod g=new GenericMethod();
		Integer[] arr1= {11,22,33};
		Character[] arr2= {'f','k','z'};
		System.out.println("Integer array:");
		g.print(arr1);
		System.out.println("Charcter array:");
		g.print(arr2);
		

	}

}