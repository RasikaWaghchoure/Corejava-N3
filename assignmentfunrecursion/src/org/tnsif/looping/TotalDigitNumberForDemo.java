package org.tnsif.looping;

//import java.util.Scanner;

public class TotalDigitNumberForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=456;
		System.out.println(" Enter the number :"+n);
		int count=0;
		for(count=0;n!=0;count++)
		{
			n=n/10;
		}
		System.out.println(" The Count is: "+count);
	}

}
