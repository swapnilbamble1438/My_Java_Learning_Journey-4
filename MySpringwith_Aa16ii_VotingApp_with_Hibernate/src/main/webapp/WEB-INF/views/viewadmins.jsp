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
<center>
<%@ include file = "adminnavbar.jsp" %>

<div class="container" id="cb" style="background-color: white">


<center>
<div class = "container mt-3"> 
	<div class = "row">
		<div class = "col-md-12">
			<h1 class = "text-center mb-3">All Admin Details</h1>
		
<table style="border: 1px solid ; text-align: center">
  <thead class="thead-dark">
    <tr style="background-color:#ebe9eb">
      <th scope="col">Id</th>
      <th scope="col">Admin Name</th>
      <th scope="col">Password</th>
 
      <th scope = "col" colspan="2">Actions</th>
    </tr>
  </thead>
  <tbody>
   
   <c:forEach items="${admins}" var="a">
    <tr>
      <th scope="row">${a.id }</th>
      <td>${a.name}</td>
      <td>${a.password}</td>
   
      <td>
      	<a href="deleteadmin/${a.id }"><img src="<c:url value="resources/image/delete.jpg"/>" height="25px" alt="Delete"></a>
      </td>
      <td>
      	<a href= "updateadmin/${a.id }"><img src="<c:url value="resources/image/update.png"/>" height="35px" alt="Update"></a>
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