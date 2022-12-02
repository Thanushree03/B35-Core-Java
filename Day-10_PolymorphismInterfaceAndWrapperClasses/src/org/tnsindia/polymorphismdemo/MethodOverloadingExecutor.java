package org.tnsindia.polymorphismdemo;
//driver class
public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		//object creation
		MethodOverloadingExample m=new MethodOverloadingExample();
		
		//method calling
		m.addition(12, 10);
		m.addition(34, 20, 9);
		
		System.out.println();
		
		//method calling
		MethodOverloading m1=new MethodOverloading();
		m1.addition(23, 50);
		m1.addition(25.6f, 56);

	}

}
