package com.rakesh.mvcpattern;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.rakesh.dbConn.dbConnection;



import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/alldata")
public class AllUsers extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter out=res.getWriter();
		res.setContentType("text/html");
		
		try {
			Connection conn=dbConnection.getConnection();
			
			String sqlQuery="SELECT * FROM register";
			PreparedStatement ps=conn.prepareStatement(sqlQuery);
			
			ResultSet rs=ps.executeQuery();
			out.print("<table border='2px'>");
			while(rs.next()) {
				String name=rs.getString(1);
				String email=rs.getString(2);
				String pass=rs.getString(3);
				
				out.print("<tr><td>"+name+"</td>"+"<td>"+email+"</td><td>"+pass+"</td?</tr>");
				
				
			
			}
			out.print("</table>");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
