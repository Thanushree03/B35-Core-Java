package org.tnsindia.abstractdemo;
//abstract class
abstract class ATMMachine {
	
	//abstract class contain abstract or non-abstract method
	
	//abstract method
    abstract void withdraw();
    
    //non-abstract method
    void display()
    {
    	System.out.println("non-abstract method");
    }
}
