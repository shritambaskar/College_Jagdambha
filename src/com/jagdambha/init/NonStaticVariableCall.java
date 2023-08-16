package com.jagdambha.init;

public class NonStaticVariableCall {

	public static void main(String[] args) {
	
		NonStaticVariable nsv = new NonStaticVariable();
		
		//Introducing local variable
		String fName = nsv.firstName;
		String lName = nsv.lastName;
		long mob = nsv.mobNumber;
		
		System.out.println(fName);
		System.out.println(lName);
		System.out.println(mob);

	}

}
