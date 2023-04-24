//driver class
package org.tnsif.firstpackage;

public class AccessSpecifierExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b = new Base();
		b.methoddefault();
		b.methodpublic();
		b.methodprotected();
		/* private members we can't access into another class*/
		//b.methodprivate();
		//b.varprivate();	
		System.out.println(b instanceof Base);
		
		

	}

}