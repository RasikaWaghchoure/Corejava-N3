package org.tnsif.thiskeyword;

class Mathematics
{
	int a,b;
	Mathematics()
	{
		a=10;
		b=29;
	}
	Mathematics accept()
	{
		return this;
	}
	void Display()
	{
		System.out.println("the value of a is "+a);
		System.out.println("the value of b is "+b);
	}
}

public class ThisRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mathematics m=new Mathematics();
		m.accept().Display();

	}

}
