package com.jagdambha.methods;

public class StaticMethodCall {

	public static void main(String[] args) {
		
		//Using ClassName.methodName
//		StaticMethod.getData();
//		StaticMethod.getDetails();
		
		//Using Object Reference
		
		StaticMethod sm = new StaticMethod();
		sm.getData();
		sm.getDetails();
		

	}

}
