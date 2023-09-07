package com.jagdambha.inheritance;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SingleInheritance {

	String fName, lName;
	public static void main(String[] args)throws Exception {
		
		SingleInheritance si = new SingleInheritance();
		si.getFirstName();
		si.getLastName();
		
		

	}

	public void getLastName()throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Last Name");
		lName = br.readLine();
		
		
	}

	protected void getFirstName()throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter First Name");
		fName = br.readLine();
		
	}

}
