package org.tnsif.polymorphism;

public class Multiplication {
	int num1(int x,int y)
	{
		return x*y;
	}
	
	int num1(float x,float y)
	{
		return (int) (x*y);
	}

}
