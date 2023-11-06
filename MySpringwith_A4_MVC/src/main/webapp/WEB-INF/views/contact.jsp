<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact</title>
</head>
<body>
<form action = "processform3" method= "post">
<h1>${Header}</h1>
<h3>${Desc}</h3>
<h3>${commonmsg }</h3>
<br>
<h1>Contact Form</h1>
<br>
User Name:
<input type = "text" name = "userName" required>
<br><br>
User Password
<input type = "password" name = "userPassword" required>
<br><br>
User Email:
<input type = "email" name = "userEmail" required>
<br><br>
<input type = "submit" value = "Submit">




</form>


</body>
</html>