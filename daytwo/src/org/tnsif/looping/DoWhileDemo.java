package org.tnsif.looping;

import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=21;
		do
		{
			System.out.println(" The value of X: "+x); // first print value of x is 21
			x++;		// here value is also 21 
		}while(x<20); 
		sc.close();// x is 22
	}

}
