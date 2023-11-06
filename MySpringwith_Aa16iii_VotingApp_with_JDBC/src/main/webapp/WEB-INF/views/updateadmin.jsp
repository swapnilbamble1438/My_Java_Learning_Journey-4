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
<form action = "${pageContext.request.contextPath}/handleupdateadmin" method="post">

<div class="container" id="cb" style="background-color: white">


<h1>Update Admin Details</h1>



<input type = "hidden" value = "${admin.id }" name = "id" >

Admin Name: <input type = "text" name = "name" value = "${admin.name }" required><br><br>

Password: <input type = "password" name= "password" value = "${admin.password }" required><br><br>



<input type = "submit" value="Update">


</div>
</form>
</center>



</body>
</html>