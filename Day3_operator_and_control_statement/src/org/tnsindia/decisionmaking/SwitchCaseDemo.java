package org.tnsindia.decisionmaking;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		
		//switch case to activate the caller-tune example
		switch(num)
		{
		case 1:
		{
			System.out.println("Kesariya");
			break;
		}
		case 2:
		{
			System.out.println("Shree-Valli");
			break;
		}
		case 3:
		{
			System.out.println("Vaaste");
			break;
		}
		default:
		{
			System.out.println("Invalid Input");
		}
		}

	}

}
