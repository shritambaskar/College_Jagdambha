package com.jagdambha.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MathRandom {

	public static void main(String[] args)throws Exception {
		int otp =  (int) Math.ceil(Math.random() * 1000000);
		
		System.out.println("Your OTP is :"+otp);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter OTP");
		int inputOTP = Integer.parseInt(br.readLine());
		
		if(otp == inputOTP) {
			System.out.println("Login Successfully...");
		}else {
			System.out.println("Incorrect OTP");
		}
//		System.out.println(Math.ceil(Math.random()));
//		
//		double d = 23.45;
//		System.out.println(Math.ceil(d));
//		System.out.println(Math.floor(d));
	}
}
