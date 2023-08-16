package com.jagdambha.init;

public class NonStaticVariable {

	String firstName = "Shrikant";
	String lastName = "Tambaskar";
	long mobNumber = 9890581851l;
	public static void main(String[] args) {
		
		//Using Object Reference
		//create an object
		
		NonStaticVariable nsv = new NonStaticVariable();
		System.out.println(nsv.firstName);
		System.out.println(nsv.lastName);
		System.out.println(nsv.mobNumber);
	}
}
