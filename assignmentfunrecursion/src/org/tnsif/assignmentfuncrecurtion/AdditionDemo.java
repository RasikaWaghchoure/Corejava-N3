package org.tnsif.assignmentfuncrecurtion;

import java.util.Scanner;


//function method
public class AdditionDemo {
	//function definition with parameters
	/*static int addition(int x,int y)
	{
		int sum=x+y;
		return sum;
	}*/
	static void addition(int x,int y)
	{
		int sum=x+y;
		System.out.println("The sum is : "+sum);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of x :");
		int x=sc.nextInt();
		System.out.print("Enter the value of y :");
		int y=sc.nextInt();
		//function call
		//System.out.print(addition(x,y));
		
		addition(x,y);
		sc.close();

	}

}
