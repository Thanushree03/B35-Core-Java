package org.tnsindia.datatypes;

import java.util.Scanner;

//demo on user input for integer
public class UserInputDemo {

	public static void main(String[] args) {
		//@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter number: ");
		int x=s.nextInt();
		
		System.out.println("enter number: ");
		float y=s.nextFloat();
		
		System.out.println("enter char: ");
		char c=s.next().charAt(0);
		
		System.out.println("enter string: ");
		String str=s.next();
		
		System.out.println("The output is: ");
		System.out.println("The integer is: "+x);
		System.out.println("The decimal is: "+y);
		System.out.println("The character is: "+c);
		System.out.println("The String is: "+str);
		s.close();

	}

}
