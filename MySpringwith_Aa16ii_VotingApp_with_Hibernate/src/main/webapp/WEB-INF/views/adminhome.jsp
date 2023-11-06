
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
<%@ include file = "adminnavbar.jsp" %>
<center>
<div class="container" id="cb" style="background-color: white">
<h1>All Candidates Votes</h1>
	
		<h3>Candidate 1 : Total Votes = <b style="color: limegreen">${c1 }</b></h3>
		<h3>Candidate 2 : Total Votes = <b style="color: limegreen">${c2 }</b></h3>
		<h3>Candidate 3 : Total Votes = <b style="color: limegreen">${c3 }</b></h3>
		<h3>Candidate 4 : Total Votes = <b style="color: limegreen">${c4 }</b></h3>
		
		
		
		
	
	
</div>	
</center>	

</body>
</html>