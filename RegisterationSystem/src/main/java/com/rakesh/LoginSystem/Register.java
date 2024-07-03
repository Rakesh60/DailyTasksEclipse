package com.rakesh.LoginSystem;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.jdbc.Driver;

@WebServlet("/regForm")
public class Register extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("name");	
	String email=req.getParameter("email");	
	String gender=req.getParameter("gender");	
	String age=req.getParameter("age");	
	String city=req.getParameter("city");	
	String password=req.getParameter("password");	
	PrintWriter out=resp.getWriter();
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_db","root","123456");
		
		PreparedStatement ps=con.prepareStatement("Insert into register values(?,?,?,?,?,?)");
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setString(3, gender);
		ps.setString(4, age);
		ps.setString(5, city);
		ps.setString(6, password);
		
		int count=ps.executeUpdate();
		
		if (count>0) {
			resp.setContentType("text/html");
			out.print("<h3>Register Successfully</h3>");
			RequestDispatcher rd=req.getRequestDispatcher("/Register.jsp");
			rd.include(req, resp);
			
		} else {
			resp.setContentType("text/html");
			out.print("<h3 style='background-color:red'>Registeration Failed</h3>");
			RequestDispatcher rd=req.getRequestDispatcher("/Register.jsp");
			rd.include(req, resp);
		}
	} catch (Exception e) {
		resp.setContentType("text/html");
		out.print("<h3 style='background-color:red'>Registeration Failed Exception msg <span class='spanClass'>"+e.getMessage()+"</span></h3>");
		RequestDispatcher rd=req.getRequestDispatcher("/Register.jsp");
		rd.include(req, resp);
	}
	
	
	}
}
