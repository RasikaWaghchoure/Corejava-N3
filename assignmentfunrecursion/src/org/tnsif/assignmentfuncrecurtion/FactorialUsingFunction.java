package org.tnsif.assignmentfuncrecurtion;

import java.util.Scanner;

public class FactorialUsingFunction {

	static int factorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=i*fact;
		}
		return fact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of num :");
		int num=sc.nextInt();
		System.out.print("factorial of given number is: "+ factorial(num));
		
		sc.close();
		

	}

}
