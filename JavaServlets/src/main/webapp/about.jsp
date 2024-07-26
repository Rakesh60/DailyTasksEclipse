<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String myEmail=(String) session.getAttribute("email"); %>
Welcome : <%= myEmail %>
<h2> ${email}</h2>
<h4>About Page</h4>
<br>
<br>
<%

try{
	
}
catch(Exception ex){
	
}

%>
<a href="profile.jsp">Profile Us</a>
<a href="contact.jsp">Contact Us</a>

</body>
</html>