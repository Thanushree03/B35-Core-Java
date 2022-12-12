package org.tnsindia.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
//demo on collection interface
public class DemoOnCollectionInterface {
	
        //@SuppressWaenings("unchecked")
	public static void main(String[] args) {
		//collection is an interface we can't instantiate it
		//@SuppressWarnings("rawtypes")
		Collection<Object> obj=new ArrayList<>();
		obj.add("FullStack");
		obj.add(121);
		obj.add('z');
		obj.add(13.6f);
		System.out.println("The collection elements are: "+obj);
		//to extract the elements from arraylist
		for(Object itr:obj)
		{
			System.out.print(itr+",");
		}
		

	}

}
