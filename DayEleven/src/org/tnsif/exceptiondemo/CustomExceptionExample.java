package org.tnsif.exceptiondemo;
import java.util.Scanner;
public class CustomExceptionExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id = sc.nextLine();
		String password = sc.nextLine();
		try {
			if(id.equals("prathameshpatil691@gmail.com@gmail.com") && password.equals("pass@1234")){
				System.out.println("Credentials matched");
			}
			else {
				throw new LoginCredential("Invalid Credential");
			}
		}
		catch (LoginCredential e){
			System.out.println("Exception handled " + e);
		}
	}

}