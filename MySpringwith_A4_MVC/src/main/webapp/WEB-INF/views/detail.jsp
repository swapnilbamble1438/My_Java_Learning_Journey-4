<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %> <!-- add this line for working of jsp expression language -->

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> <!-- for traversing -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Detail</title>
</head>
<body>
<h1>My name is ${name}</h1>
<h1>And My rollnumber is ${rollnumber} </h1>
<h1>And Time is ${time }</h1>
<hr>
<h1>Numbers are ${numbers}</h1>
<hr>

<c:forEach var="item" items="${numbers }">
	
	<h1>${item }</h1>
	

</c:forEach>
<hr>
<c:forEach var="item" items="${numbers }">
	
	<h1><c:out value ="${item}"></c:out></h1>

</c:forEach>
</body>
</html>