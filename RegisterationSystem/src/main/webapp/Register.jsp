<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="register.css">
</head>
<body>
<div class="form-container">
    <h2>Registration Form</h2>
    <form action="regForm" method="post">
        <div class="form-group">
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required>
        </div>
        <div class="form-group">
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>
        </div>
        <div class="form-group">
            <label>Gender:</label>
            <div class="gender-options">
                <label for="male">
                    <input type="radio" id="male" name="gender" value="male" required> Male
                </label>
                <label for="female">
                    <input type="radio" id="female" name="gender" value="female" required> Female
                </label>
                <label for="other">
                    <input type="radio" id="other" name="gender" value="other" required> Other
                </label>
            </div>
        </div>
        <div class="form-group">
            <label for="age">Age:</label>
            <input type="number" id="age" name="age" required>
        </div>
        <div class="form-group">
            <label for="city">City:</label>
            <input type="text" id="city" name="city" required>
        </div>
        <div class="form-group">
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>
        </div>
        <div class="form-group">
            <input type="submit" value="Submit">
        </div>
    </form>
</div>

</body>
</html>