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
			<h1 class = "text-center mb-3">All User Details</h1>
		
<table style="border: 1px solid ; text-align: center">
  <thead class="thead-dark">
    <tr style="background-color:#ebe9eb">
      <th scope="col">Id</th>
      <th scope="col">User Name</th>
      <th scope="col">Password</th>
      <th scope="col">Email Id</th>
      <th scope="col">Phone No</th>
      <th scope = "col" colspan="2">Actions</th>
    </tr>
  </thead>
  <tbody>
   
   <c:forEach items="${users}" var="u">
    <tr>
      <th scope="row">${u.id }</th>
      <td>${u.name}</td>
      <td>${u.password}</td>
      <td>${u.email}</td>
      <td>${u.phoneno}</td>
      <td>
      	<a href="deleteuser/${u.id }"><img src="<c:url value="resources/image/delete.jpg"/>" height="25px" alt="Delete"></a>
      </td>
      <td>
      	<a href= "updateuser/${u.id }"><img src="<c:url value="resources/image/update.png"/>" height="35px" alt="Update"></a>
      </td>
    </tr>
   </c:forEach>
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