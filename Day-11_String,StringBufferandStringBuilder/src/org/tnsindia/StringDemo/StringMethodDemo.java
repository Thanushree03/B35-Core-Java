package org.tnsindia.StringDemo;

import java.util.Scanner;

public class StringMethodDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		String str2=s.nextLine();
       //to combine the two strings
		System.out.println(str1+str2);
		System.out.println(str1.concat(str2));
		
		//to find the length of the string
		System.out.println("The length  of the str1 is: "+str1.length());
		
		/*if character that we passed is not in the string, then we get -1*/
		System.out.println("The index of the str1 is: "+str1.indexOf('w'));
		System.out.println("The char at the 3rd index of str1 is: "+str1.charAt(3));//w
		System.out.println(str2.toUpperCase());
		System.out.println(str2.toLowerCase());

	}

}
