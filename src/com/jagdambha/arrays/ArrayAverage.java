package com.jagdambha.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrayAverage {

	public static void main(String[] args) throws Exception{
		int x=0;
		int arr[]=new int[5];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter 5 no.");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
			x=x+arr[i];
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("arr["+i+"]=" +arr[i]);
		}
		System.out.println("Addition=" +x+" avg="+(x/5));


	}

}
