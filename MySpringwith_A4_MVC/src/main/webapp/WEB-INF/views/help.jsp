<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>
<h1>Help Page</h1>
<%
String name = (String)request.getAttribute("name");
Integer rollnumber = (Integer)request.getAttribute("rollnumber");
LocalDateTime time = (LocalDateTime)request.getAttribute("time");

%>
<h1>My name is <%= name%></h1>
<h1>And My rollnumber is <%=rollnumber %></h1>
<h1>And Time is <%=time.toString() %></h1>
</body>
</html>