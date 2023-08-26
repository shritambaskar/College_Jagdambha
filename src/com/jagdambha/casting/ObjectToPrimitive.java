package com.jagdambha.casting;

public class ObjectToPrimitive {

	public static void main(String[] args) {
		
		String str1 = "56";
		String str2 = "43";
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		int result = num1 + num2;
		System.out.println(result);
		
		String str3 = "56.90";
		String str4 = "43.43";
		
		float num3 = Float.parseFloat(str3);
		float num4 = Float.parseFloat(str4);
		float result1 = num3 + num4;
		System.out.println(result1);

	}

}
