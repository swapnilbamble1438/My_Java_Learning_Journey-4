<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
<h1>This is Home page</h1>
<h1>called by home controller</h1>
<h1>url/home</h1>

<%
	String name = (String)request.getAttribute("name");
	Integer id = (Integer)request.getAttribute("id");
	List<String> friends = (List<String>)request.getAttribute("friends");
	
%>
<h1>Name is <%=name %></h1>
<h1>Id is <%=id %></h1>
<h1>
	List of Friends
	<% for(String s: friends)
	{%>
	<h1><%=s %></h1>
	
	<%} %>
	
</h1>

</body>
</html>