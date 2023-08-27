package com.jagdambha.controlflow;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IfElseIfControlFlowStructure {

	
	public static void main(String[] args)throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter UserName");
		String uName = br.readLine();
		
		System.out.println("Enter Password");
		String pass = br.readLine();
		
		if (uName.isEmpty() || pass.isEmpty()) {
			System.out.println("UserName or Password Required");
			
		}else if (uName.equals("shri") && pass.equals("aaa")) {
				System.out.println("Login Successfully...");
			}else {
				System.out.println("Invalid UserName or Password");
			}

	}

}
