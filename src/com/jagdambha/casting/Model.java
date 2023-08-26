package com.jagdambha.casting;

public class Model {

	int id;
	String fName,mName,lName;
	long mobile;
	String address;
	
	
	public Model() {
		super();
	}

	public Model(int id, String fName) {
		super();
		this.id = id;
		this.fName = fName;
	}
	
	public Model(long mobile, String address) {
		super();
		this.mobile = mobile;
		this.address = address;
	}
	
	public Model(int id, String fName, String mName, String lName, long mobile, String address) {
		super();
		this.id = id;
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
		this.mobile = mobile;
		this.address = address;
	}
	
	
}
