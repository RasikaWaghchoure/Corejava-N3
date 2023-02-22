package org.tnsif.setdemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// program hashset for unordered
		Set<Object>obj=new HashSet<>();
		obj.add(190);
		obj.add("Rasika");
		obj.add(89.7);
		System.out.println(" THE Set Hash Elements are:"+obj);
		
		Set<Object>obj1=new LinkedHashSet<>();
		obj1.add(410);
		obj1.add("Gauri");
		obj1.add(907.9f);
		System.out.println(" THE Set Linked Hash Elements are:"+obj1);
		
		obj1.addAll(obj);
		System.out.println(" THE Set Linked Hash Elements are:"+obj1);
	}

}
