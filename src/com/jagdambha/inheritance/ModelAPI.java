package com.jagdambha.inheritance;

public class ModelAPI {

	private int empId;
	private String fName,lName;
	private long mobile;
	private String email;
	
	public ModelAPI() {
		
	}
	public ModelAPI(int empId, String fName, String lName, long mobile, String email) {
		
		this.empId = empId;
		this.fName = fName;
		this.lName = lName;
		this.mobile = mobile;
		this.email = email;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
