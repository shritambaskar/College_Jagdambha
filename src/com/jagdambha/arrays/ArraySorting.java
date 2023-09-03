package com.jagdambha.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArraySorting {

	public static void main(String[] args) throws Exception{
		
		int arr[]=new int[5];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		// 5 Input Number
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter" + (i+1)+" no.");
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		//Output 5 Numbers
		System.out.println("Before Sorting");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("arr["+i+"] = "+arr[i]);
		}
		
		// Sorting of Numbers
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{	
				if(arr[i]>arr[j])
				{
					int t=arr[i];
					arr[i]=arr[i];
					arr[j]=t;
				}
			}
		}
		
		//Final output of the program
		System.out.println("After Sorting");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("arr["+i+"] = "+arr[i]);
		}


	}

}
