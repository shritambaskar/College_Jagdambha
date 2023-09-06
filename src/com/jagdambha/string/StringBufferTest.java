package com.jagdambha.string;

public class StringBufferTest {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("This is Demo Java Example");
		System.out.println(sb.append(" Yavatmal"));
		System.out.println(sb.reverse());
		
		
		StringBuffer s1=new StringBuffer("Hello");
		System.out.println("s1 = "+s1);
		s1.append("Friend");
		s1.append(123);
		s1.append('x');
		System.out.println("Again s1 = "+s1);
		s1.reverse();
		System.out.println("In reverse s1 = "+s1);


	}

}
