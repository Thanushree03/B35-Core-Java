package org.tnsindia.datatypes;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		
			//@SuppressWarnings("resource")
			Scanner s=new Scanner(System.in);
			
			
			
			System.out.println("enter string: ");
			String str=s.nextLine();
			String str1=s.next();
			
			System.out.println("The output is: ");
			
			System.out.println("The String is: "+str);
			System.out.println("The String is: "+str1);
			s.close();

	}

}
