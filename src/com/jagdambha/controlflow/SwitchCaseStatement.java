package com.jagdambha.controlflow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchCaseStatement {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1. Addition \n 2.Substraction \n 3.Division \n 4.Multiplication \n 5.Exit \n Enter your choice…………");
		int x=Integer.parseInt(br.readLine());
		System.out.println("Enter num1");
		int a=Integer.parseInt(br.readLine());
		System.out.println("Enter num2");
		int b=Integer.parseInt(br.readLine());
		int c=0;

		switch(x)
		{	
			case 1:c=a+b;
				System.out.println("Addition of "+a+"and"+b+"="+c);
				break;
			case 2:c=a-b;
				System.out.println("Substraction of "+a+"and"+b+"="+c);
				break;
			case 3:c=a*b;
				System.out.println("Multiplication of "+a+"and"+b+"="+c);
				break;
			case 4:c=a/b;
				System.out.println("Division of "+a+"and"+b+"="+c);
				break;
			case 5:System.exit(0);
				break;
			default:System.out.println("Invalid choice");
		}


	}

}
