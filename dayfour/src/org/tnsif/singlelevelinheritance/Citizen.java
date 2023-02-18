package org.tnsif.singlelevelinheritance;

public class Citizen {
	private String name; 
	private String addhar;
	private String city;
	private long mbno;
	
	//
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddhar() {
		return addhar;
	}
	public void setAddhar(String addhar) {
		this.addhar = addhar;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getMbno() {
		return mbno;
	}
	public void setMbno(long mbno) {
		this.mbno = mbno;
	}
	
	public Citizen()
	{
		System.out.println(" Parent Class");
	}
	
	//constructor
	
	public Citizen(String name, String addhar, String city, long mbno) {
		super();
		this.name = name;
		this.addhar = addhar;
		this.city = city;
		this.mbno = mbno;
	}
	
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", addhar=" + addhar + ", city=" + city + ", mbno=" + mbno + "]";
	}
	
}
