package org.tnsif.polymorphism;
// demonstrate program on method overriding

public class RBI {
	float getInterest()
	{
		return 10.3f;
	}

	// HERE If we use method overriding in same class we shows that the error only for that we used 
	// inheritance
	/*float getInterest()
	{
		return 10.3f;
	}*/

}
