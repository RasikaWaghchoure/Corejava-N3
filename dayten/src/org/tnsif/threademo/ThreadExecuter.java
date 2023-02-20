package org.tnsif.threademo;

public class ThreadExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimplthreadProgram p=new SimplthreadProgram();
		// used to change the thread name
		p.setName("void ");
		p.setPriority(8);
		// when thread calls to start method ,it will come to run 
		p.start();
		
		//p.start();
         System.out.print(" current thread"+p);

	}

}
