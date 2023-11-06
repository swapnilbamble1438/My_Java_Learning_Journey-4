<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>${stud}</h1>

<h1>${stud2}</h1>
<h1>${stud2.name}</h1>
<h1>${stud2.id }</h1>
<h1>Courses: ${stud2.courses }</h1>
<hr>
<h1>Address: </h1>
<h1> Street is ${stud2.address.street }</h1>
<h1> Street is ${stud2.address.city }</h1>

</body>
</html>
