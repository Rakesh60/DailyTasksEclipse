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
<h4>Contact Page</h4>
<br>
<br>
<a href="about.jsp">About Us</a>
<a href="profile.jsp">Profile Us</a>
</body>
</html>