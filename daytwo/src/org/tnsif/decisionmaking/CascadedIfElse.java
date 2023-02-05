package org.tnsif.decisionmaking;

import java.util.Scanner;

public class CascadedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("The a is Greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("The b is Greater");
		}
		else
		{
			System.out.println("The C is Greater");
		}
		sc.close();

	}

}
