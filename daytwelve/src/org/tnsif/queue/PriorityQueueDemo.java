package org.tnsif.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer>obj=new PriorityQueue<>();
		//obj.add(22);
		obj.offer(22);
		//obj.add(89);
		obj.offer(89);
		obj.add(45);
		obj.add(12);
		System.out.println(" Queue Elements are:"+obj);
		/*obj.remove();
		obj.remove();
		obj.remove();
		obj.remove();
		obj.remove();*/
		
		/*obj.poll();
		obj.poll();
		obj.poll();
		obj.poll();
		obj.poll();*/
		obj.remove();
		System.out.println(" Queue Elements are:"+obj);
		System.out.println(" Queue Elements are:"+obj.peek());
		

	}

}
