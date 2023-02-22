package org.tnsif.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<String>obj=new ArrayDeque<>();
		obj.add("Rajesh");
		obj.addFirst("Rasika");
		obj.addLast("Waghchoure");
		System.out.println(" The Array Deque Elements are:"+obj);
		
		// 
		for(String itr:obj)
		{
			System.out.println(itr+" ");
		}
		System.out.println();
		
		obj.remove();
		System.out.println(" The Array Deque Elements are:"+obj);
		obj.removeFirst();
		System.out.println(" The Array Deque Elements are:"+obj);
		obj.removeLast();
		System.out.println(" The Array Deque Elements are:"+obj);
		}

}
