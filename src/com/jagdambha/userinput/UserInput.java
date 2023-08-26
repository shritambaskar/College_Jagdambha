package com.jagdambha.userinput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserInput {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//How to take String value as Input
		System.out.println("Enter Your Name ");
		String name = br.readLine();
		System.out.println("My Name is "+name);
		
		//How to convert String value to int 
		System.out.println("Enter Your Roll Number");
		int roll = Integer.parseInt(br.readLine());
		System.out.println("Roll Number is "+roll);
		
		System.out.println("Enter First Number");
		int num1 = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Second Number");
		int num2 = Integer.parseInt(br.readLine());
		
		int num3 = num1 + num2;
		System.out.println(num3);
		
		System.out.println("Enter Mobile Number");
		long mobile = Long.parseLong(br.readLine());
		System.out.println(mobile);
	}

}
