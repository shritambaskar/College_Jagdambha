package com.jagdambha.casting;

public class ObjectToObjectCasting {

	int x, y;
	
	public ObjectToObjectCasting() {
		
		x = 20;
		y = 50;
		System.out.println("Default Constructor");
	}
	
	ObjectToObjectCasting(int m, int n){
		x = m;
		y = n;
		System.out.println("Parameterised Constructor");
	}
	
	ObjectToObjectCasting(ObjectToObjectCasting a){
		
		x = a.x;
		y = a.y;
		System.out.println("Constructor Having object Value");
	}
	

	public static void main(String[] args) {
		
		ObjectToObjectCasting object1 = new ObjectToObjectCasting();
		object1.getValue();
		
		ObjectToObjectCasting object2 = new ObjectToObjectCasting(34, 98);
		object2.getValue();
		
//		Model m = new Model();
		
		ObjectToObjectCasting object3 = new ObjectToObjectCasting(object2);
		object3.getValue();
		
		new ObjectToObjectCasting(object1).getValue();

	}
	
	public void getValue() {
		System.out.println("X = "+x +" and Y = "+y);
	}

}
