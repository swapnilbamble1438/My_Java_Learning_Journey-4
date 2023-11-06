<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>File Upload Home Page</title>
</head>
<body>
<form action = "uploadimage" method = "post" enctype= "multipart/form-data">
<h1>Upload Image</h1>

<br>
<div class = "form-group">
	<label for="Select Image">Select Image</label>
	<input type = "file" class = "" id = " " name = "image" required>	
</div>
<br>
<input type ="submit" value= "Upload Image">

</form>
</body>
</html>