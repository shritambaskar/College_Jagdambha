package com.jagdambha.controlflow;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IfControlFlowStructure {

	String uName;
	String pass;
	public static void main(String[] args) throws Exception {
		
		IfControlFlowStructure ic = new IfControlFlowStructure();
		ic.inputUserName();
		ic.inputPassword();
		ic.validateData();
	}

	private void inputPassword() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Password");
		pass = br.readLine();
		
		if (pass.isEmpty()) {
			System.out.println("Password Required");
			inputPassword();
		}
	}

	private void inputUserName()throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter UserName");
		uName = br.readLine();	
		
		if (uName.isEmpty()) {
			System.out.println("Username Required");
			inputUserName();
		}
	}

	private void validateData()throws Exception {
		//Validation
		//UserName =
		
//		if(uName.equals("shrikant")) {
//			System.out.println("UserName correct");
//		}else {
//			System.out.println("UserName Incorrect");
//			inputUserName();
//		}
//		
//		//Password
//		
//		
//		
//		if (pass.equals("qwertyuio")) {
//			System.out.println("Password Correct");
//		}else {
//			System.out.println("Password Incorrect");
//			inputPassword();
//		}
//		
		
		if (uName.equals("shrikant") && pass.equals("qwertyuio")) {
			System.out.println("Login Successfully......");
		}else {
			System.out.println("Invalid UserName or Password....");
			inputUserName();
			inputPassword();
		}
	}

}
