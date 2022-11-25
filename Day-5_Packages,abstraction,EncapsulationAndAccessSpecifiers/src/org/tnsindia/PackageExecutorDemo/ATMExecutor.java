package org.tnsindia.PackageExecutorDemo;

import java.util.Scanner;

//importing the class of another package
//import org.tnsindia.packagesdemo.ATM;

import org.tnsindiaPackagesDemo.ATM;

//driver class
public class ATMExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the card no: ");
		String card_no=s.nextLine();
		ATM obj=new ATM();
		obj.display(card_no);
		s.close();

	}

}
