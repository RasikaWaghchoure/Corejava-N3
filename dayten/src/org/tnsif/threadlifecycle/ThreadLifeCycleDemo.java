package org.tnsif.threadlifecycle;

public class ThreadLifeCycleDemo {

	public static void main(String[] args) {
		// Auto-generated method stub
		Tech t=new Tech();
		SoftSkill s=new SoftSkill();
		t.start();
		
		t.yield();
		
		s.start();

	}

}
