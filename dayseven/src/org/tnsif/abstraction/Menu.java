package org.tnsif.abstraction;

//program to demonstrate that the abstract class and abstract method

public abstract class Menu {
	//abstract method
	abstract void recipe();
	abstract void foodType();
	//non abstract method
	void menuType()
	{
		System.out.println(" Veg and Nonveg");
	}
	

}
