<%@page import="java.util.List"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="com.A1_Crud.Member"%>
<%@page import="com.A1_Crud.ManageMember"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border>
		<thead>
			<tr>
				<th>mid</th>
				<th>name</th>
				<th>salary</th>
				
				<th colspan="2" align="center">Actions</th>
			</tr>
		</thead>
		<tbodY>
		
		<%
			ManageMember dao = new ManageMember();
			List<Member> list = dao.listMember();
			for(Member s : list)
			{%>
			<tr>
				<td><%= s.getMid()%></td>
				<td><%= s.getMname() %></td>
				<td><%= s.getMsalary() %></td>
				
				</tr>
			<%}
		%>
		
		
		</tbodY>
		</table>


</body>
</html>