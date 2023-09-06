package com.jagdambha.string;

public class StringTest {

	public static void main(String[] args) {
		
		String college = "Jagdambha College of Engineering             ";
		System.out.println(college.toLowerCase());
		System.out.println(college.charAt(6));
		System.out.println(college.length());
		System.out.println(college.startsWith("J"));
		String newStr = college.trim();
		System.out.println(newStr.length());
		String []name = {"Shrikant","Nikhil","Manasi","Rutuja"};
		
		System.out.println(String.join(" @ ", name));
		
		System.out.println(newStr.concat(" Yavatmal"));
		String rep = college.replace("College", "Collage");
		System.out.println(rep);
		
		
		byte[] b = {65,66,67,68,69,50};
		char ch[] = {'x' , 'y' , 'z' , '1' , '2'};
		String s1 = new String();
		String s2 = new String(b);
		String s3 = new String(b,0,3);
		String s4 = new String(ch);
		String s5 = new String(ch,2,2);
		String s6 = new String(s2);
		System.out.println("S1 = " +s1);
		System.out.println("S2 = " +s2);
		System.out.println("S3 = " +s3);
		System.out.println("S4 = " +s4);
		System.out.println("S5 = " +s5);
		System.out.println("S6 = " +s6);
		
		String fullName = "Shrikant";
		fullName.concat("Tambaskar");
		fullName.concat("Yavatmal");
		
		System.out.println(fullName);
		

		
	}

}
