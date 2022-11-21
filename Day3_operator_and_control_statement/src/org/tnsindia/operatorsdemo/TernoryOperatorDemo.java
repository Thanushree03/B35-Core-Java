package org.tnsindia.operatorsdemo;
//demo on ternary operator

import java.util.Scanner;

public class TernoryOperatorDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a and b: ");
		int a=s.nextInt();//11
		int b=s.nextInt();//65
		int result=(a>b)?a:b;
		System.out.println("the result is: "+result);

	}

}
