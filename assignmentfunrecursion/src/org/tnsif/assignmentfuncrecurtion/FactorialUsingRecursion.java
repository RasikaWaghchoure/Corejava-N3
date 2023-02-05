package org.tnsif.assignmentfuncrecurtion;

import java.util.Scanner;

public class FactorialUsingRecursion {
	
	//function definition
	static int factorial(int num)
	{
		if(num!=0)
			return num*factorial(num-1);
		return 1;
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
