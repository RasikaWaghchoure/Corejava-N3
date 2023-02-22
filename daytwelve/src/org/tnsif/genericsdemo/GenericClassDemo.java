package org.tnsif.genericsdemo;

//program to demonstrate on generic class
//Generic Class Definition
class GenericClass<T>
{
	T x;
	void Display(T x)
	{
		this.x=x;
	}
	T Accept()
	{
		return x;
	}
}

public class GenericClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClass<String>obj1=new GenericClass<String>();
		obj1.Display(" MET ");
		System.out.println(" "+obj1.Accept());
		

	}

}
