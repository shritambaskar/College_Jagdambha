package com.jagdambha.init;

public class StaticVariable {

	//static variable
	static int pinCode = 445001;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Direct Access within same class
		System.out.println("Pin code is "+pinCode);
		
		//Using ClassName.variablename
		
		System.out.println("Pin Code is "+StaticVariable.pinCode);
		
		// Using Object
		
		//How to create an Object
		
		StaticVariable staticVariable = new StaticVariable();
		System.out.println("Pincode is "+staticVariable.pinCode);

	}

}
