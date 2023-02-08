package org.tnsif.instanceofdemo;

public class child extends Person {
		private int age;
		// generate getter and setter
		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		//

		public child() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		//
		public child(int age) {
			super();
			this.age = age;
		}

		public child(String name, String address,int age)
		{
			super();
			this.age = age;
		// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "child [age=" + age + ", getName()=" + getName() + ", getAddress()=" + getAddress() + "]";
		}
		
		//
		
		//
		
		

		//
		
		
		
		
		
}
