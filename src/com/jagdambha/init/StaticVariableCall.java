package com.jagdambha.init;

public class StaticVariableCall {

	public static void main(String[] args) {
		System.out.println("Pincode is "+StaticVariable.pinCode);

		System.out.println("Pi Value is "+LocalVariable.pi);
		
		StaticVariable sv = new StaticVariable();
		System.out.println(sv.pinCode);
		
		LocalVariable lv =  new LocalVariable();
		System.out.println(lv.pi);
	}

}
