package com.jagdambha.inheritance;

public class SuperVSThis extends SuperDemo {

	String name , email;
	public static void main(String[] args) {
		SuperVSThis s = new SuperVSThis();
		s.getData();
	}
	public void getData() {
		
		this.name = super.name;
		System.out.println(name);
		
	}
}
