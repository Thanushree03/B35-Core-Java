package org.tnsindia.interfacedemo;

import java.util.Scanner;
//implementable class for the interface
public class Shape implements Area{

	@Override
	public void rectangle() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length and breadth of the rectangle");
		int length=s.nextInt();
		int breadth=s.nextInt();
		System.out.println("The area of rectangle is: "+(length*breadth));
		
		/*Below line if we use here then we can't give the input for another method*/
		//s.close();
		
	}

	@Override
	public void circle() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		int radius=s.nextInt();
		System.out.println("The area of circle is: "+(3.142*radius*radius));
		s.close();
		
	}
	

}
