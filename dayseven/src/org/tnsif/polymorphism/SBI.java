package org.tnsif.polymorphism;

public class SBI extends RBI {
	
	// child class
	float getInterest()
	{
		System.out.println("THE Interest for Parent class RBI:"+super.getInterest());
		return 17.3f;
	}


}
