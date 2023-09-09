package com.jagdambha.inheritance;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SuperDemo {

	String name = "Shrikant", email = "shri@gmail.com";
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Employee ID");
		int empId = Integer.parseInt(br.readLine());
		
		System.out.println("Enter First Name");
		String fName = br.readLine();
		
		System.out.println("Enter Last Name");
		String lName = br.readLine();
		
		System.out.println("Enter Mobile Number");
		long mobile = Long.parseLong(br.readLine());
		
		System.out.println("Enter Email");
		String email = br.readLine();
		
		
		ModelAPI m = new ModelAPI(empId, fName, lName, mobile, email);
		
		DemoInheritance di = new DemoInheritance();
		di.getAllData();
		
		
	}
}
