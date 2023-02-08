package org.tnsif.thiskeyword;

class Main
{
	int num;
	Main()
	{
		
	}
	Main(int num1)
	{
		num=num1;
	}
	
}

public class ThisKeywordExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main obj=new Main(5);
		//obj.Main();
		//obj.Main(4);
		System.out.println(" Num value is:"+obj.num);

	}

}
