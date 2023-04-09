package org.tnsif.operatordemo;

public class IncrementAndDecrementDemo {

	public static void main(String[] args) {
		
		int a = 12, b = 5;
		
		int x = a++;
		++a;
		System.out.println(x);
        System.out.println(a);
        
        int y = b--;
        --b;
        System.out.println(y);
        System.out.println(b);
        
	}

}