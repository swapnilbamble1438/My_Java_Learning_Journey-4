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
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/a1.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/a2.css">
</head>
<body style="background-color: #f6f5f3">

<center>

<%@ include file = "adminnavbar.jsp" %>
<form action = "${pageContext.request.contextPath}/handleupdateuser" method="post">

<div class="container" id="cb" style="background-color: white">

<h1>Update User Details</h1>
<input type = "hidden" value = "${user.id }" name = "id" >

User Name: <input type = "text" name = "name" value = "${user.name }" required><br><br>

Password: <input type = "password" name= "password" value = "${user.password }" required><br><br>

Email Id: <input type = "text" name= "email" value = "${user.email }" required><br><br>

Phone No: <input type = "number" name= "phoneno" value = "${user.phoneno }" required><br><br>


<input type = "submit" value="Update">

</div>
</form>
</center>
</body>
</html>