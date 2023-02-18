package org.tnsif.singlelevelinheritance;

// this is the child class

public class Student extends Citizen {

	//private data members
	private int rollno;
	private String studname;
	
	// generate getter and setter method
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getStudname() {
		return studname;
	}
	public void setStudname(String studname) {
		this.studname = studname;
	}
	//
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	//constuctor
	
	public Student(String name, String addhar, String city, long mbno,int rollno, String studname) {
		super(name,addhar,city,mbno);
		this.rollno = rollno;
		this.studname = studname;
	}
	//
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", studname=" + studname + ", getRollno()=" + getRollno()
				+ ", getStudname()=" + getStudname() + ", getName()=" + getName() + ", getAddhar()=" + getAddhar()
				+ ", getCity()=" + getCity() + ", getMbno()=" + getMbno() + "]";
	}
	
	
	
	
	
	//
	
	
	

	
	
	
	
	
	}

