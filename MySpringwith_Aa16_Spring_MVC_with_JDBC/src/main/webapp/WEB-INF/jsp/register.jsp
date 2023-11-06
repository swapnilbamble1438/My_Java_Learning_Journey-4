<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix = "form" uri="http://www.springframework.org/tags/form" %>
	<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
	<h2> Register Form</h2>
	
	<br>
	<h2>${msg }</h2>
	
	<form method = "post" action = "store" modelAttribute="bean">
	
	Enter roll: <input type = "number" name = "roll" required>
	<br>
	Enter name: <input type = "text" name = "name" required>
	<br>
	Enter email: <input type = "text" name = "email" required>
	<br>
	Enter mobile: <input type = "number" name = "mobile" required>
	<br>
	<input type = "submit" value = "Register">
	
	
	</form>
	



</center>
</body>
</html>