

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;



public class WelcomeServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=response.getWriter();
	out.println("Welcome to Servlet school");
	}



}
