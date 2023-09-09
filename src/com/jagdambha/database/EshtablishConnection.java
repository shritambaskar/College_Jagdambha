package com.jagdambha.database;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.cj.xdevapi.PreparableStatement;

public class EshtablishConnection {

	public static void main(String[] args)throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","");
		
		System.out.println("Connection Established....");
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your ID");
		int id = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Your Name");
		String name = br.readLine();
		
		System.out.println("Enter Your Mobile");
		String mobile = br.readLine();
		
		
		String query = "insert into employee values(?,?,?)";
		
		PreparedStatement pst = con.prepareStatement(query);
		
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setString(3, mobile);
		pst.executeUpdate();
		
		System.out.println("Data Inserted Successfully");

	}

}
