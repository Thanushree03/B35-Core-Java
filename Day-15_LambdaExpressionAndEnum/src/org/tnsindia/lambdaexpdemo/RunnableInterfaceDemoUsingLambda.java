package org.tnsindia.lambdaexpdemo;

public class RunnableInterfaceDemoUsingLambda {

	public static void main(String[] args) {
		/*Runnable interface is a functional interface which exactly contains 
		 * one abstract method run();*/
		Runnable obj=()->
		{
			//implementing run() method
			System.out.println("implementing runnable interface");
		};
		obj.run();
		

	}

}
