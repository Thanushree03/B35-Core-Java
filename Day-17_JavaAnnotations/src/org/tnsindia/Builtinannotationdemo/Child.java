package org.tnsindia.Builtinannotationdemo;

public class Child extends Parent{
	public String name="Diya";
	
	@Override
	public void display()
	{
		
		super.display();
		System.out.println("Child Name: "+name);
	}
	
	
	

}
