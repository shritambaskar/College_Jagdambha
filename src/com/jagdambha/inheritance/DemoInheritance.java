package com.jagdambha.inheritance;

class DemoInheritance {

	public static void main(String[] args) {
		
		DemoInheritance di = new DemoInheritance();
		di.getAllData();

	}

	public void getAllData() {
		
		ModelAPI m = new ModelAPI();
		System.out.println(m.getEmpId());
		System.out.println(m.getfName());
		System.out.println(m.getlName());
		System.out.println(m.getMobile());
		System.out.println(m.getEmail());
		
	}

}
