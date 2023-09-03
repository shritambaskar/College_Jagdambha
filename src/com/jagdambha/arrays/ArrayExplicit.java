package com.jagdambha.arrays;

public class ArrayExplicit {

	public static void main(String[] args) {
		
		//1 way to initialise array
		int city[] = new int[5];
		
		city[0] = 445001;
		city[1] = 440030;
		city[2] = 440028;
		city[3] = 440010;
		city[4] = 440012;
		
		for (int i = 0; i < city.length; i++) {
			System.out.println(city[i]);
		}
	
		//2 way to initialise array
		
		String name[] = {"Shrikant","Ashish","Atul","Vinod","Ram"};
		int len = name.length;
		System.out.println(len);
		
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		
		//3 way to initialise array
		
		char ch[] = new char[] {'e','r','y','u','i','q'};
		int len1 = ch.length;
		System.out.println(len1);

	}

}
