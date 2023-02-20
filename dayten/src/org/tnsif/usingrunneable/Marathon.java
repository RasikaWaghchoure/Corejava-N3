package org.tnsif.usingrunneable;
//program to demonstrate that interface usong ruunnable method

public class Marathon implements Runnable {
	
	//private data members
	private int speed;
	private String city;
	
	

	public int getSpeed() {
		return speed;
	}



	public void setSpeed(int speed) {
		this.speed = speed;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Speed of Participant:"+speed+" & the City of Participant is:"+city);
	
		
	}
	
	
}
