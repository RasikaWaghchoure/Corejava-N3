package org.tnsif.encapsulationdemo;

import java.util.Scanner;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print(" enter the pin: ");
		HDFC h=new HDFC();
		h.setPin(sc.nextInt());
		System.out.print(h.getPin());
		h.accept();
		sc.close();

	}
}

