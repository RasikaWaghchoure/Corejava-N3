package org.tnsif.assignmentfuncrecurtion;

import java.util.Scanner;

public class FibbonacciUsingRecursion {
	
	//function definition
	static int num1=0,num2=1,num3=0;
		static void fibbonacci(int num)
		{
			if(num>0)
			{
				
				num3=num1+num2;
				num1=num2;
				num2=num3;
				System.out.print(" "+num3);
				fibbonacci(num-1);
			}
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of num :");
		int num=sc.nextInt();
		System.out.print("fibbonacci sereis is: "+num1+" "+num2);
		fibbonacci(num-2);
		sc.close();
	}

}
