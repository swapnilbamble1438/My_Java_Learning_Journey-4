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
<form action = "handleaddcandidate" method="post">
<div class="container" id="cb" style="background-color: white">
<h1>Add Candidate</h1>



Candidate 1: <input type = "text" name = "candidate1" required><br><br>

Candidate 2: <input type = "text" name= "candidate2" required><br><br>

Candidate 3: <input type = "text" name= "candidate3" required><br><br>

Candidate 4: <input type = "text" name= "candidate4" required><br><br>


<input type = "submit" value="Add Candidate">
</div>
</form>
</center>

</body>
</html>