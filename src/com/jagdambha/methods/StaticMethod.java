package com.jagdambha.methods;

public class StaticMethod {

	String firstName = "Shrikant";
	String lastName = "Tambaskar";
	long mobNumber = 9890581851l;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getData();
		getDetails();
		
		
		// Code for execution Time
		StaticMethod sm = new StaticMethod();
		
		// get the start time
	    long start = System.nanoTime();

	    // call the method
	    sm.display();

	    // get the end time
	    long end = System.nanoTime();

	    // execution time
	    long execution = end - start;
	    System.out.println("Execution time: " + execution + " nanoseconds");
		System.out.println("Done!!!!");
		
		

	}
	
	// create a method
	  public void display() {
	    System.out.println("Calculating Method execution time:");
	  }

	public static void getDetails() {
		
		String email = "shri.tambaskar@gmail.com";
		String gender = "Male";
		int pinCode = 445001;
		System.out.println(email);
		System.out.println(gender);
		System.out.println(pinCode);
		
	}

	public static void getData() {
		
		StaticMethod sm = new StaticMethod();
		System.out.println(sm.firstName);
		System.out.println(sm.lastName);
		System.out.println(sm.mobNumber);
		
		
	}
	

}
