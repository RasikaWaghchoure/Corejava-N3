package org.tnsif.classandobject;

import java.util.Scanner;

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Customer c=new Customer(11,"Rasika","Nashik");
		//c.display();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id ,name, and city");
		int id;
		String custname,city;
		
		id=sc.nextInt();
		sc.nextLine();
		
		custname=sc.nextLine();
		city=sc.nextLine();
		
		Customer c=new Customer();
		c.setId(id);
		c.setCustname(custname);
		c.setCity(city);
		c.display();
		/*System.out.println(c.getId());
		System.out.println(c.getCustname());
		System.out.println(c.getCity());*/
		
		// for cust2
		
		System.out.println(" Enter the id ,name, and city");
		int id1;
		String custname1,city1;
		
		id1=sc.nextInt();
		sc.nextLine();
		
		custname1=sc.nextLine();
		city1=sc.nextLine();
		
		Customer c1=new Customer();
		c1.setId(id1);
		c1.setCustname(custname1);
		c1.setCity(city1);
		c1.display();
		sc.close();
		
	}

}
