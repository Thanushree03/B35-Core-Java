package org.tnsindia.collectiondemo;

import java.util.ArrayList;

import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Character>obj=new ArrayList<>(3);
		obj.add('N');//0th index
		obj.add('S');//1st index
		obj.add('K');//2nd index
		obj.add('S');//3rd index
		obj.add('O');//4rth index
		List<Character>obj1=new ArrayList<>(3);
		System.out.println(obj1.isEmpty());
		System.out.println(obj.isEmpty());
		System.out.println(obj.contains('O'));
		
		System.out.println("the collection elements are: "+obj);
		//size of the list
		System.out.println("the total elements are: "+obj.size());
		System.out.println("the index of given element are: "+obj.indexOf('S'));
		System.out.println("the last index is: "+obj.lastIndexOf('S'));

		System.out.println("the collection elements are: "+obj.get(2));

	}

}
