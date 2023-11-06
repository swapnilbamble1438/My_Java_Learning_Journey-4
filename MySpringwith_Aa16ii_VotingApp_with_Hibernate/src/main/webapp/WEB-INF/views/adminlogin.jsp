<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <!-- jstl uri -->
   <%@ taglib prefix= "c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    
    <%@ page isELIgnored= "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" name="viewport" content="width=device-width, initial-scale=1">
<title>${title}</title>
<link rel="stylesheet" href="resources/css/a1.css">
<link rel="stylesheet" href="resources/css/a2.css">
</head>
<body style="background-color: #f6f5f3">
<%@ include file = "navbar.jsp" %>
<%@ include file = "cookie.jsp" %>
<center>
<form action = "${pageContext.request.contextPath}/checkadmin" method = "post">
<div class="container" id="cb" style="background-color: white">



<h1>Admin Login</h1>
<%
if(msg != null)
{%>
<p style="color: red"><%=msg %></p>
<% }%>

<p style="color: red">${msg }</p>
<b>
Admin Name: <input type = "text" name = "name" placeholder="Enter Admin Name" required><br><br>

Password: <input type = "password" name= "password" placeholder="Enter Password" required><br><br>
</b>
<input type = "submit" value="Login">

<br>
<br>
 <div style="color: firebrick"><h3><b>Try using</b></h3>
            <h4><b>Username: admin</b></h4>
            <h4><b>Password: admin</b></h4>
</div>
</form>
</center>


</body>
</html>