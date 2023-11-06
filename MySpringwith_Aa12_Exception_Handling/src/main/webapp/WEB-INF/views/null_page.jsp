
<%@page import="org.springframework.ui.Model"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Null Page</title>
</head>
<body>
<% 
String msg = (String)request.getAttribute("msg");
if(msg != null)
{%><h1>${msg}</h1>
<%}	
else
{%>
<h1>Something went wrong!</h1>
<%}%>
<h3>Sorry, an error has occured Requested page not found!</h3>


</body>
</html>