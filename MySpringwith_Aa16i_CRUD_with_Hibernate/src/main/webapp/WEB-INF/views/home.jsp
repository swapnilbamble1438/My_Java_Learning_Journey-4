<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- base.jsp file is imported -->
<%@ include file = "./base.jsp" %>
</head>

<body background="<c:url value='/resources/image/backgroundimg.jpg' />">
<!-- <body background="${pageContext.request.contextPath}/resources/images/background.jpg"> -->

<h1>Home</h1>
<div class = "container mt-3"> 
	<div class = "row">
		<div class = "col-md-12">
			<h1 class = "text-center mb-3">Welcome to Product App</h1>
		
<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Product Name</th>
      <th scope="col">Description</th>
      <th scope="col">Price</th>
      <th scope = "col" colspan="2">Actions</th>
    </tr>
  </thead>
  <tbody>
   
   <c:forEach items="${products}" var="p">
    <tr>
      <th scope="row">${p.id }</th>
      <td>${p.name}</td>
      <td>${p.description}</td>
      <td>${p.price}</td>
      <td>
      	<a href="delete/${p.id }"><i class="fas fa-trash-alt text-danger"></i></a>
      </td>
      <td>
      	<a href= "update/${p.id }"><i class="fas fa-pen-nib"></i></a>
      </td>
    </tr>
   </c:forEach>
  </tbody>
</table>
		
		<div class= "container text-center">
			<a href = "addproduct" class = "btn btn-outline-success">Add Product</a>
		</div>
		</div>
	</div>
</div>

</body>
</html>