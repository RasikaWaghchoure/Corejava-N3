package org.tnsif.polymorphism;

import java.util.Scanner;

public class MethodOverloadingExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the resolution and slottype");
		int resolution=sc.nextInt();
		sc.nextLine();
		String slottype=sc.nextLine();
		
		SmartPhone s=new SmartPhone();
		s.setResolution(resolution);
		s.setSlottype(slottype);
		s.display(resolution,slottype);
		
		Multiplication m=new Multiplication();
		System.out.println(m.num1(5,8));
		System.out.println(m.num1(5,8));
		//s.display(s);
	}

}
