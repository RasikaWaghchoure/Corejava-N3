package org.tnsif.encapsulationdemo;

public class HDFC {
	
	// data member is in private
	private int pin;
	void accept()
	{
		System.out.print(" It is Your ATM Pin .");
	}
	
	//getter and setter method
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
}
