package com.jagdambha.controlflow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchCaseStatement {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Your Choices Are \n1.Addition \n2.Substraction \n3.Division "
				+ "\n4.Multiplication \n5.Exit\n Enter your choice…………");
		
		int choice =Integer.parseInt(br.readLine());
		
		System.out.println("Enter num1");
		int a = Integer.parseInt(br.readLine());
		
		System.out.println("Enter num2");
		int b = Integer.parseInt(br.readLine());
		
		int c = 0;

		switch(choice)
		{	
			case 1: c=a+b;
				System.out.println("Addition of "+a+"and"+b+"="+c);
				break;
			case 2: c=a-b;
				System.out.println("Substraction of "+a+"and"+b+"="+c);
				break;
			case 3: c=a*b;
				System.out.println("Multiplication of "+a+" and "+b+" = "+c);
				break;
			case 4: c=a/b;
				System.out.println("Division of "+a+"and"+b+"="+c);
				break;
			case 5: System.exit(0);
				break;
			default: System.out.println("Invalid choice");
		}


	}

}
