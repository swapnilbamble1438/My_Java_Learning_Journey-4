<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action = "handleform" method="post">
Name:
<input type = "text" name = "name" required>
<br><br>
Your id:
<input type = "text" name = "id" required>
<br><br>
Your DOB:
<input type = "text" name = "date" placeholder="dd/mm/yyyy" required>
<br><br>
Select Course:
<select name = "courses" multiple>
<option>Java</option>
<option>Python</option>
<option>C++</option>
<option>Django</option>
<option>Spring Framework</option>
</select>
<br><br>
Select Gender:
Male<input type = "radio" name = "gender" value = "Male" > &ensp;
Female<input type = "radio" name = "gender" value = "Female" >
<br><br>
Select Type:
Old Student<input type = "radio" name = "type" value = "Old Student" > &ensp;
New Student<input type = "radio" name = "type" value = "New Student" >
<br><br>
<input type = "submit" value = "Submit">


</select>

</form>

</body>
</html>