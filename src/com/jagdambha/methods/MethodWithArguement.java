package com.jagdambha.methods;

public class MethodWithArguement {

	public static void main(String[] args) {
		
		//Methods with Arguement
		getEmployeeId(1060);
		MethodWithArguement arguement = new MethodWithArguement();
		arguement.getAllData(23,"Shampoo",1200.99);
		
		MethodWithReturnType type = new MethodWithReturnType();
		String data = type.getProductDetails();
		System.out.println(data);

	}
	
	private void getAllData(int productId, String productName,double price) {
		// TODO Auto-generated method stub
		System.out.println(productId+ " "+productName+" "+price);
		
	}

	public static void getEmployeeId(int employeeId) {
		System.out.println("The Employee Id :"+employeeId);
	}

}
