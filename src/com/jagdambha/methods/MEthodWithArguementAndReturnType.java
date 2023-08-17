package com.jagdambha.methods;

public class MEthodWithArguementAndReturnType {

	public static void main(String[] args) {
		MEthodWithArguementAndReturnType mt = new MEthodWithArguementAndReturnType();
		String data = mt.getCollegeData(1121, "JCOET", 47500.89, "Yavatmal");
		System.out.println(data);
	}

	public String getCollegeData(int colCode, String cName, double fees, String address) {
		boolean isBusAvailable = true;
		String details = colCode + " " + cName + " " + fees + " " + address + " " + isBusAvailable;
		return details;
	}

}
