<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ include file = "./base.jsp" %>
</head>
<body background="<c:url value='/resources/image/background.jpg' />">

<center>
<form action = "handleaddproduct" method = "post">
<h1>Add Product</h1>
<br><br>
Product Name:
<input type = "text" name = "name" required>
<br><br>
Product Description:
<textarea name = "description" id = "description" rows = "5" ></textarea>
<br><br>
Product Price:
<input type = "text" name = "price" required>
<br><br>

<a href= "${pageContext.request.contextPath}/">Back</a>&ensp;<input type = "submit" value = "Add Product">

</form>
</center>
</body>
</html>