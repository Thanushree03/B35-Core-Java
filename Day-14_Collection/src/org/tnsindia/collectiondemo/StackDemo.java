package org.tnsindia.collectiondemo;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String>obj=new Stack<>();
		//insertion
        obj.push("Thanu");
        obj.push("Uday");
        obj.push("Harshith");
        obj.push("Bhavya");
        System.out.println(obj);
        //remove-Last In First Out[LIFO]
        obj.pop();
        System.out.println(obj);
	}

}
