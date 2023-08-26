package com.jagdambha.casting;

public class PrimitiveToObject {

	public static void main(String[] args) {
		PrimitiveToObject p = new PrimitiveToObject();
		p.integerCasting();
//		System.out.println(p);
		

	}

	private void integerCasting() {
		
		int pinCode = 445001;
		Integer i = new Integer(pinCode);
		System.out.println(i);
		
		ArrayIndexOutOfBoundsException io = new ArrayIndexOutOfBoundsException();
		System.out.println(io);
		
	}

}
