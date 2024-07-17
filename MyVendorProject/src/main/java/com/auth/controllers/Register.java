package com.auth.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.dbConn.Dbconnection;

@WebServlet("/regForm")
public class Register extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
	String name=req.getParameter("name");
	String email=req.getParameter("email");
	String password=req.getParameter("password");
	
	try {
		
				
		Connection conn2=Dbconnection.getConnection();
		
		String insertQuery="INSERT INTO registeration VALUES(?,?,?)";
		PreparedStatement ps=conn2.prepareStatement(insertQuery);
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, password);
		
		int count= ps.executeUpdate();
		if(count>0) {
			
			out.print("<h2 style='background-color:green;color:white;text-align:center'>Register Successfully</h2>");
			RequestDispatcher rd=req.getRequestDispatcher("/Login.html");
			rd.include(req, resp);
		}
		else {
			
			out.print("<h2 style='background-color:green;color:white'>Registration Failed</h2>");
			RequestDispatcher rd=req.getRequestDispatcher("/Register.html");


			rd.include(req, resp);
		}
		
		
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
		out.print("<h2 style='background-color:red;color:white'>Registration Failed</h2>");
		RequestDispatcher rd=req.getRequestDispatcher("/Register.html");
	}
	
	

	
	}
}
