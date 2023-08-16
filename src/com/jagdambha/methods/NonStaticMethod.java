package com.jagdambha.methods;

public class NonStaticMethod {

	public static void main(String[] args) {
		
		NonStaticMethod nsm = new NonStaticMethod();
		
		nsm.getClassDetails();

	}

	public void getClassDetails() {
		
		int roll = 1;
		String name = "ABC";
		int age = 20;
		
		System.out.println("Roll Number :"+roll+"\tName :"+name+"\tAge :"+age);
		
	}
	

}
