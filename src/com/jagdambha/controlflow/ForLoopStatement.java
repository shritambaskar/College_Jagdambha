package com.jagdambha.controlflow;


public class ForLoopStatement {

	public static void main(String[] args) {
		
		for (int counter = 0; counter < 5; counter++) {
			System.out.println(counter);
			
			int i = 0;
			if (i < 5) {
				System.out.println(i);
				continue;
			}

		}
		
		
	}

}
