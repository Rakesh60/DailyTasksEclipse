package com.rakesh;



import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		String name=req.getParameter("uname");
		String password=req.getParameter("pass");
		System.out.println(name+" "+password);
		res.getWriter().print("Success");
	}
	
	
	

}
