package com.jagdambha.methods;

public class MethodOverloading {

	int id;
	String fName,lName;
	long pinCode,mobile;
	
	public static void main(String[] args) {
		
		MethodOverloading mo = new MethodOverloading();
		mo.getData();
		mo.getData(1128);
		mo.getData("Jagdambha", "College");
		mo.getData(445002L, 9890581851L);
		
		mo.getData(mo.id, mo.fName, mo.lName, mo.pinCode, mo.mobile);
		

	}
	
	public void getData() {
		System.out.println("Method having no arguement");
	}
	
	public void getData(int id) {
//		System.out.println("My Employee Id is "+id);
		this.id = id;
	}
	
	public void getData(String fName, String lName) {
//		System.out.println("My Name is "+fName + " "+lName);
		this.fName = fName;
		this.lName = lName;
	}
	
	public void getData(long pinCode, long mobile) {
//		System.out.println("Pincode is "+pinCode+ "and Mobile is "+mobile);
		
		this.pinCode = pinCode;
		this.mobile = mobile;
	}
	
	public void getData(int id,String fName,String lName,long pinCode,long mobile) {
		System.out.println(id);
		System.out.println(fName);
		System.out.println(lName);
		System.out.println(pinCode);
		System.out.println(mobile);
	}

}
