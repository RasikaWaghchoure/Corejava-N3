package org.tnsif.thiskeyword;

class HR
{
	void display()
	//void display(Hr h)
	{
		System.out.println(" human resource");
	}
	void accept()
	{
		//display(this);
		display();
	}
}

public class ThiskeywordExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HR h=new HR();
		h.accept();

	}

}
