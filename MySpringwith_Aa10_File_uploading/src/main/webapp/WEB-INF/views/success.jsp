<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored = "false"  %>
    
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success Result</title>
</head>
<body>
<br>
<h1> ${msg }</h1>
<br>
<img src="<c:url value="resources/image/${filename}"/>" height="100px">

</body>
</html>