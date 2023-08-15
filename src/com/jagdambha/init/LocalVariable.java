package com.jagdambha.init;

public class LocalVariable {

	//static variable
	static float pi = 2.456f;
	
	//non-static variable
	String restAPI = "https://www.google.com";
	public static void main(String[] args) {
		//Local Variable
		
		int x =980;
		
		//Printing local variable
		System.out.println("The value is "+x);
		/*
		 * System.out.println(pi); System.out.println(LocalVariable.pi);
		 */
//		 Using Object
		
		LocalVariable lv = new LocalVariable();
		System.out.println(lv.pi);
		System.out.println("Rest Call is "+lv.restAPI);
		

	}
	
	public void getData() {
		System.out.println(pi);
	}

}
