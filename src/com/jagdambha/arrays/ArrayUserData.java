package com.jagdambha.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrayUserData {

	public static void main(String[] args)throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("How many Elements You Want Define for an Array");
		int size = Integer.parseInt(br.readLine());
		
		String name[] = new String[size];
		
		for (int i = 0; i < name.length; i++) {
			System.out.println("Enter "+ (i+1) +" name");
			name[i] = br.readLine();
			
		}
		
		System.out.println("Your Array Data is :");
		for (int i = 0; i < name.length; i++) {
			System.out.println((i+1) + " Name is :"+ name[i]);
		}

	}

}
