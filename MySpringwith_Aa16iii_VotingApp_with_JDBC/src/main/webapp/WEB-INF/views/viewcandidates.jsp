<%@page import="org.springframework.beans.factory.annotation.Autowired"%>
<%@page import="com.dao.CandidateDAO"%>
<%@page import="com.model.Candidate"%>
<%@page import="java.util.List"%>
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


<center>

<div class = "container mt-3"> 
	<div class = "row">
		<div class = "col-md-12">
			<h1 class = "text-center mb-3">All Candidates Details</h1>
		
<table style="border: 1px solid ; text-align: center">
  <thead class="thead-dark">
    <tr style="background-color:#ebe9eb">
      <th scope="col"></th>
      <th scope="col">Candidate 1 Votes</th>
      <th scope="col">Candidate 2 Votes</th>
      <th scope="col">Candidate 3 Votes</th>
      <th scope="col">Candidate 4 Votes</th>
     <th scope = "col" colspan="2">Actions</th>
    </tr>
  </thead>
  <tbody>
   
  
   <c:forEach items="${candidates}" var="c">
    <tr >
      <th scope="row" style="background-color:#ebe9eb">Voter</th>
      <td>${c.candidate1}</td>
      <td>${c.candidate2}</td>
      <td>${c.candidate3}</td>
      <td>${c.candidate4}</td>
      <td>
      	<a href="deletevote/${c.id }"><img src="<c:url value="resources/image/delete.jpg"/>" height="25px" alt="Delete"></a>
      </td>
  
    
    </tr>
    
   </c:forEach>
  
   <tr style="background-color:#ebe9eb">
		<th scope="row">Total Votes</th>
		<td>${c1 } </td>
		<td>${c2 } </td>
		<td>${c3 } </td>
		<td>${c4 } </td>
	</tr>
  </tbody>
</table>


		</div>
	</div>
</div>

</center>

</div>

</center>

</body>
</html>