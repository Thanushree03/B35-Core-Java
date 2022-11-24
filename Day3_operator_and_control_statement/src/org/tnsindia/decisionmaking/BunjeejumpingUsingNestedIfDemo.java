package org.tnsindia.decisionmaking;

import java.util.Scanner;

public class BunjeejumpingUsingNestedIfDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		int weight=s.nextInt();
		
		//nested if---for bunjee jumping
		/*
		 * 1. minimum age is 12
		 * 2. minimum weight is required 40 and maximum 120
		 * 3. if weight>120 then extra ropes will be added----*/
		if(age>=12)
		{
			if(weight>=40 && weight<=120)
			{
			System.out.println("Eligible for Bunjee jumping");
			}
			else if(weight>120)
			{
				System.out.println("extra ropes will be added");
			}
			}
			else
			{
				System.out.println("not eligible for Bunjee jumping");
			}
		}

	}
