package com.project.dbConn;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnection {


	public static Connection getConnection() {
		Connection  conn=null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/vendorManagement","root","123456");
			System.out.println("Connection done");
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		return conn;
	}
}
