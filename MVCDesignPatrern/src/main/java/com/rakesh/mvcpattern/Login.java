package com.rakesh.mvcpattern;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.rakesh.dbConn.dbConnection;
import com.rakesh.model.User;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class Login extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		
		try {
			Connection conn=dbConnection.getConnection();
			
			String sqlQuery="SELECT * FROM register WHERE email=? AND password=?";
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
				out.print("<h2 style='background-color:orange;color:white'>Email & password not matched</h2>");
				RequestDispatcher rd=req.getRequestDispatcher("/login.html");
				rd.include(req, resp);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
}
