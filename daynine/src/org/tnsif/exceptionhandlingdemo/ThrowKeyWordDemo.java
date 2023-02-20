package org.tnsif.exceptionhandlingdemo;

import java.io.IOException;

public class ThrowKeyWordDemo {
    public static void donate (int age, int weight) throws Exception
    {
    	if (age>18 && weight>50) 
    	
    		System.out.println(" Eliagble ");
    	
    		
    	else  
    		throw new IOException("not eligiable");
    }
    	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try
		{
			donate(19,55);
		}
		catch(IOException e) 
		{
			System.out.println(e);
		}

	}

}