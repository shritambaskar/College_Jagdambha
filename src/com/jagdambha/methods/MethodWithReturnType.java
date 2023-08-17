package com.jagdambha.methods;

public class MethodWithReturnType {

	public static void main(String[] args) {
		MethodWithReturnType type = new MethodWithReturnType();
		System.out.println("All Product Details are "+type.getProductDetails());
//		String data = type.getProductDetails();
//		System.out.println("All Product Details are "+data);
		
		System.out.println("My Address :" +getAddress());
		
		getActivateOrDeactivate();

	}

	private static boolean getActivateOrDeactivate() {
		
		boolean isActivate = true;
		return isActivate;
		
	}

	private static String getAddress() {
		
		String address = "Besa Road Nagpur";
		return address;
		
	}

	private String getProductDetails() {
		
		int pId =23;
		String pName = "Abc";
		double price = 123.45;
		String detail = pId + " " + pName +" " + price;
		return detail;
		
	}

}
