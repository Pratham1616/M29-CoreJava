//program to demonstrate on Auto Boxing
/*autoboxing: conversion of primitive to object type
 * example: char to character*/
package org.tnsif.autoandunboxing;

public class AutoBoxingExample {

	public static void main(String[] args) {
		//primitive variable
		int num = 1045;
		
		//autoboxing
		//converting primitive to object type
		Integer x = num;
		System.out.println("Value of x is: " + x);

	}

}