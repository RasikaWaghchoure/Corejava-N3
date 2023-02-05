package org.tnsif.looping;

public class TotalDigitWhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		System.out.println(" Enter the number :"+n);
		int count=0;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		System.out.println(" The Count is: "+count);

	}

}
