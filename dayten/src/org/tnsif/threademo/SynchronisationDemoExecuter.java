package org.tnsif.threademo;

public class SynchronisationDemoExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SynchronisationDemo obj=new SynchronisationDemo();
		ThreadOne t1=new ThreadOne (obj);
		ThreadTwo t2=new ThreadTwo (obj);
		t1.start();
		t2.start();

	}

}
