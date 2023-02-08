package org.tnsif.thiskeyword;

class Account
{
	int a; 			
	int b;
	public void setdata(int a,int b)
	{
		this.a=a;		//here left side a is variablele and right a is method
		this.b=b;
	}
	public void showdata()
	{
		System.out.println(" Value of A:"+a);
		System.out.println(" Value of B:"+b);
	}
}

public class ThiskeywordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a=new Account();
		a.setdata(4,8);
		a.showdata();
		
		

	}

}
