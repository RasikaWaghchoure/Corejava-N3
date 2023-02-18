package org.tnsif.finalkeyword;

public class FinalKeywordExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.name="Rasika";
		c.display();
		
		c.setPrice(410);
		c.display(c.getPrice());

	}

}
