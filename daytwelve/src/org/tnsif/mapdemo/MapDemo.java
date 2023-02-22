package org.tnsif.mapdemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String>obj=new HashMap<>();
		obj.put(411001,"MG Road pune ");//pune
		obj.put(422001,"MG Road nashik"); //nashik
		System.out.println(obj);
		
		Map<Integer,String>obj1=new LinkedHashMap<>();
		obj1.put(411001,"MG Road pune ");//pune
		obj1.put(422001,"MG Road nashik"); //nashik
		System.out.println(obj1);


	}

}
