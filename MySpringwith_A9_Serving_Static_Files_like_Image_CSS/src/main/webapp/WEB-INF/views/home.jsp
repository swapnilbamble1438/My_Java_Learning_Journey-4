<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- jstl  -->
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- css  -->
<!-- 
<link href = "<c:url value = "/resources/css/style.css"/>">
 -->
 <link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet">
<!-- js  -->
<script src = "<c:url value = "/resources/js/script.js"/>"></script>

<title>Home</title>
</head>
<body>
<h1>Welcome To Home</h1>
<!-- image  -->
<img src="<c:url value="resources/image/himage.jpg"/>" height="100px">
<br><br>
<img src = "resources/image/himage.jpg" height= "100px"/>
</body>
</html>