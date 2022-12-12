package org.tnsindia.collectiondemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
//demo on hashmap
//HashMap prints the value in an unordered manner and LinkedHashMap prints an ordered wise
//TreeMap print the entries according to ascending orders of keys
public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer,String>obj=new TreeMap<>();
		//Map<Integer,String>obj=new LinkedHashMap<>();
		//Map<Integer,string>obj=new HashMap<>();
		obj.put(1001,  "Thanu");
		obj.put(1005,  "Madhu");
		obj.put(2003,  "Keerthi");
		obj.put(1002,  "Hema");
		System.out.println(obj);
		
		obj.remove(1005);//it removes the entire entry for key 1005
		System.out.println(obj);
		//to extract the entry from a map
		for(Map.Entry m:obj.entrySet())
		{
        System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
