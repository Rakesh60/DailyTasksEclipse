package com.auth.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.auth.model.User;
import com.project.dbConn.Dbconnection;
@WebServlet("/Login")
public class Login extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		
		try {
			Connection conn=Dbconnection.getConnection();
			
			String sqlQuery="SELECT * FROM registeration WHERE email=? AND password=?";
			PreparedStatement ps=conn.prepareStatement(sqlQuery);
			ps.setString(1, email);
			ps.setString(2, password);
			
			ResultSet rs=ps.executeQuery();
			if (rs.next()) {
				User user=new User();
				user.setName(rs.getString("name"));
				user.setEmail(rs.getString("email"));
				
				HttpSession session =req.getSession();
				session.setAttribute("session_user", user);
				RequestDispatcher rd=req.getRequestDispatcher("/profile.jsp");
				rd.forward(req, resp);
			}
			else {
				out.print("<div class=\"bg-orange-500 text-white text-xl flex justify-center items-center\">\r\n"
						+ "<h2 class=\"  inline-block text-center \">Email & password not matched</h2>  </div>");
				RequestDispatcher rd=req.getRequestDispatcher("/Login.html");
				rd.include(req, resp);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
}
