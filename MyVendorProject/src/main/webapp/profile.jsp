<%@page import="com.auth.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <script src="https://cdn.tailwindcss.com"></script>
</head>
<body>
<%
   User user=(User) session.getAttribute("session_user");
%>
  <div class="flex justify-center items-center h-screen">
    <div class="bg-gray-300 shadow-md rounded-lg px-10 py-8">
      <div class="text-center mb-4">
        <h1 class="text-2xl font-bold">Profile</h1>
      </div>

      <div class="flex justify-center mb-4 ">
        <img src="https://ashallendesign.ams3.cdn.digitaloceanspaces.com/public/blog/72/13-placeholder-avatar-and-image-websites.png" alt="Profile Picture" class="rounded-full w-24 h-24 bg-red-300">
      </div>

      <div>
        <h2 class="text-xl font-medium mb-2">Username:</h2>
        <p class="text-gray-600"><%= user.getName() %></p>
      </div>

      <div>
        <h2 class="text-xl font-medium mb-2">Email:</h2>
        <p class="text-gray-600"><%= user.getEmail() %></p>
      </div>

      </div>
      <a href="Logout" class="bg-red-500 hover:bg-red-700 text-white font-bold py-2 px-4 rounded">
  Logout
</a>
      
  </div>
</body>
</html>