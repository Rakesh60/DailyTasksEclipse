package com.rakesh.dbConn;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbConnection {
	
//	this method returns connection method
	public static Connection getConnection() {
		
		
		Connection  conn=null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mvcpattern","root","123456");
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		return conn;
	}
	
}
