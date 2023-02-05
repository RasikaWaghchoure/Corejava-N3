package org.tnsif.decisionmaking;

import java.util.Scanner;

public class IfElseDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(x>y)
		{
			System.out.println(" The x is grater then y");
		}
		else
		{
			System.out.println("The x is smallest then y");
		}
		sc.close();
	}
}
