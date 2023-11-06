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
<%@ include file = "usernavbar.jsp" %>
<center>

<form action = "processvote" method="post">
<div class="container" id="cb" style="background-color: white">


<%String msg = request.getParameter("msg"); 
if(msg != null)
{%>
<h1 style="color: red"><%=msg %></h1>
<%} %>
<b>	${name }	do vote </b> <br>
<input value ="${name }" name = "name" type="hidden" >
	
 <br>
 <input type="radio" name="candidate"  value ="candidate1" required >&ensp;<b>Candidate 1 </b> <br><br>
  <input type="radio" name="candidate"  value = "candidate2" required >&ensp;<b>Candidate 2</b> <br><br>
  <input type="radio" name="candidate"  value = "candidate3" required >&ensp;<b>Candidate 3</b> <br><br>
  <input type="radio" name="candidate"  value = "candidate4" required >&ensp;<b>Candidate 4</b> <br><br>
    
    <br>
</select> 


    
<input type = "submit" value="Vote">


</div>
</form>
</center>
</body>
</html>