package org.tnsif.decisionmaking;

import java.util.Scanner;

public class iflooping {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(x>y)
			System.out.println(" The x is grater then y");
		System.out.println("The x is smallest then y");
		sc.close();
	}

}
