package org.tnsif.superkeyword;

public class Flower {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*public Flower(String name) {
		//super();
		this.name = name;
	}*/

	public Flower() {
		System.out.println("Flower: parent class");
		// TODO Auto-generated constructor stub
	}

	public Flower(String name) {
		super();
		this.name = name;
	}
	
	
}
