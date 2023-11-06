<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ include file = "./base.jsp" %>
</head>
<body background="<c:url value='/resources/image/backgroundimg.jpg' />">

<center>
<form action = "${pageContext.request.contextPath}/handleupdateproduct" method = "post">
<h1>Update Product Details</h1>
<br><br>

<input type = "hidden" value = "${product.id }" name = "id"/>

Product Name:
<input type = "text" name = "name" value = "${product.name }" required>
<br><br>
Product Description:
<textarea name = "description" id = "description" rows = "5" >${product.description }</textarea>
<br><br>
Product Price:
<input type = "text" name = "price" value = "${product.price }"  required>
<br><br>


<a href= "${pageContext.request.contextPath}/">Back</a>&ensp;<input type = "submit" value = "Update Product">

</form>
</center>
</body>
</html>