package com.jagdambha.inheritance;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SingleChildInheritance extends SingleInheritance {

	String email,address;
	BufferedReader br;
	static SingleChildInheritance sci;
	public static void main(String[] args)throws Exception {
		
		sci = new SingleChildInheritance();
		sci.getEmail();
		sci.getAddress();
		

	}

	private void getAddress()throws Exception {
		
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Email");
		address = br.readLine();
		
	}

	private void getEmail() throws Exception{
		sci.getFirstName();
		sci.getLastName();
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Email");
		email = br.readLine();
	}

}
