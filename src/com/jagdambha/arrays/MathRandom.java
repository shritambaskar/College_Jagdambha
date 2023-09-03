package com.jagdambha.arrays;

public class MathRandom {

	public static void main(String[] args) {
		int otp =  (int) Math.ceil(Math.random() * 1000000);
		
		System.out.println("Your OTP is :"+otp);
		
//		System.out.println(Math.ceil(Math.random()));
//		
//		double d = 23.45;
//		System.out.println(Math.ceil(d));
//		System.out.println(Math.floor(d));
	}
}
