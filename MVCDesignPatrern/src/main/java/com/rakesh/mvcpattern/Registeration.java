package com.rakesh.mvcpattern;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.rakesh.dbConn.dbConnection;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/regForm")
public class Registeration extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
	String name=req.getParameter("name");
	String email=req.getParameter("email");
	String password=req.getParameter("password");
	
	try {
		System.out.println("reg line 29");
		Connection conn2=dbConnection.getConnection();
		System.out.println("reg line 31");
		String insertQuery="INSERT INTO register VALUES(?,?,?)";
		PreparedStatement ps=conn2.prepareStatement(insertQuery);
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, password);
		
		int count= ps.executeUpdate();
		if(count>0) {
			
			out.print("<h2 style='background-color:green;color:white'>Register Successfully</h2>");
			RequestDispatcher rd=req.getRequestDispatcher("/login.html");


			rd.include(req, resp);
		}
		else {
			
			out.print("<h2 style='background-color:green;color:white'>Registration Failed</h2>");
			RequestDispatcher rd=req.getRequestDispatcher("/register.html");


			rd.include(req, resp);
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	
	

	
	}
}
