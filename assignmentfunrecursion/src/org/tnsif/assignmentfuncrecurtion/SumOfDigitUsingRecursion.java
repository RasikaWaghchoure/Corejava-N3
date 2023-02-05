package org.tnsif.assignmentfuncrecurtion;

import java.util.Scanner;

public class SumOfDigitUsingRecursion {
	static int sumofdigit(int num)
	{
		if(num==0)
			return 0;
		return(num % 10+sumofdigit(num/10));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of num :");
		int num=sc.nextInt();
		int res=sumofdigit(num);
		System.out.println("Sum of digits is "+ num +" is  "+res);
		sc.close();

	}

}
