<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" name="viewport" content="width=device-width, initial-scale=1">
<title>${title}</title>
<link rel="stylesheet" href="resources/css/a1.css">
<link rel="stylesheet" href="resources/css/a2.css">
</head>
<body style="background-color: #f6f5f3">
<center>
<form action = "handleaddadmin" method="post">

<div class="container" id="cb" style="background-color: white">
<%String msg = request.getParameter("msg"); 
if(msg != null)
{%>
<p style="color: red"><%=msg %></p>
<% }%>

<h1>Add Admin</h1>



Admin Name: <input type = "text" name = "name" required><br><br>

Password: <input type = "text" name= "password" required><br><br>


<input type = "submit" value="Add Admin">

</div>
</form>
</center>

</body>
</html>