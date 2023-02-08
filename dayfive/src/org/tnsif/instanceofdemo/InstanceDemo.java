package org.tnsif.instanceofdemo;

import java.util.Scanner;

public class InstanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the name, address ,age:");
		String name=sc.nextLine();
		String address=sc.nextLine();
		int age=sc.nextInt();
		
		//
		child c=new child();
		child c1=new child(name,address,age);
		c1.setName(name);
		c1.setAddress(address);
		c1.setAge(age);
		System.out.println(c1 instanceof Person);
		System.out.println(c1 instanceof child);

	}

}
