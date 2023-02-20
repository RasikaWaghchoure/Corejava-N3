package org.tnsif.customexception;

public class LoginCredential extends Exception {
	// data members 
	 private String str;
// parameterized 
	public LoginCredential(String str) {
		super();
		this.str = str;
	}
	@Override
	public String toString() {
		return "LoginCreadiantial [str=" + str + "]";
	}
	

}