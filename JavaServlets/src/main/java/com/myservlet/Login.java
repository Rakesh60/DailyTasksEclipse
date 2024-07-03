package com.myservlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String myEmail=req.getParameter("eamil");
		String myPass=req.getParameter("password");
		PrintWriter out=res.getWriter();
		
		if(myEmail.equals("rakesh@gmail.com")) {
			req.setAttribute("email", myEmail);
			RequestDispatcher rd=req.getRequestDispatcher("/profile.jsp");
			rd.forward(req, res);
		}
		else {
			res.setContentType("text/html");
			out.print("<h2 style='color:red'>Email didn't matched</h2>");
			RequestDispatcher rd=req.getRequestDispatcher("/index.html");
			rd.include(req, res);
			
		}
		
	}

}
