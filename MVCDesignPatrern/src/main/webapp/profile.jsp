<%@page import="com.rakesh.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% User user =(User) session.getAttribute("session_user"); %>
<h3>Welcome to profile</h3>

<h2>Name: <%=user.getName() %></h2>
<h2 style='background-color:seagreen;color:white;display:inline;padding:1rem;'>Email: <%=user.getEmail() %></h2>
<br><br>
<a href="logout">logout</a>
</body>
</html>