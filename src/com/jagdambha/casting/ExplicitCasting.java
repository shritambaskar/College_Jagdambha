package com.jagdambha.casting;

public class ExplicitCasting {

	public static void main(String[] args) {
		ExplicitCasting ex = new ExplicitCasting();
		ex.primitiveCasting();

	}

	public void primitiveCasting() {
		
		short a =90, b =89;
		short c = (short)(a + b);
		
		System.out.println(c);
		double d= 56.34;
		int z = (int) d;
		System.out.println(z);
		
		int x = 280;
		byte bt = (byte) x;
			 
		System.out.println("x = " +x +"\n b = " +bt);
		int n = 300;
		char ch= (char) n;
		System.out.println("ch = " +ch+" \n n = "+n);

		
	}

}
