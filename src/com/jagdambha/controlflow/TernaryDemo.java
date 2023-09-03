package com.jagdambha.controlflow;

import java.io.BufferedReader;

import java.io.InputStreamReader;

public class TernaryDemo {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter First Number");
		int num1 = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Second Number");
		int num2 = Integer.parseInt(br.readLine());
		
		System.out.println((num1 > num2) ? num1+" is Greater" : num2+" is Greater");

	}

}
