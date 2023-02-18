package org.tnsif.hirarchicalinheritance;

public class AndroidVersion {

	private String type;
	//
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	//
	public AndroidVersion()
	{
		System.out.println("parent class=android version");
		
	}
	//
	public AndroidVersion(String type) {
		super();
		this.type = type;
	}
	//

	@Override
	public String toString() {
		return "AndroidVersion [type=" + type + ", getType()=" + getType() + ", getClass()=" + getClass() + "]";
	}
}
