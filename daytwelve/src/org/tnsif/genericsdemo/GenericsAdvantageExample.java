package org.tnsif.genericsdemo;

import java.util.ArrayList;

public class GenericsAdvantageExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList obj=new ArrayList<>();
		obj.add(15);
		obj.add("15");
		System.out.println(" Without Generics "+obj);
		
		// with generics
		
		ArrayList<String> obj1=new ArrayList<>();
		//obj1.add(15);
		obj1.add("15");
		System.out.println(" With Generics "+obj1);
		
		//
		ArrayList obj2=new ArrayList<>();
		obj2.add("Met");
		//obj.add("15");
		String str=(String)obj2.get(0);
		System.out.println(str);
		
		//
		ArrayList obj3=new ArrayList<>();
		obj3.add("MET");
		//obj.add("15");
		String str1=(String)obj3.get(0);
		System.out.println(str1);
	}

}
