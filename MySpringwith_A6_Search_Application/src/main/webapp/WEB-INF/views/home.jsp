<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">


<title>Home</title>
</head>
<body>


<h1>This is home view</h1>

<div class = "container">
	<div class = "card mx-auto mt-5 bg-secondary" style="width:50%">
		<div class = "card-body py-5">
			<h3 class= "text-center text-white" style="text-transform:uppercase">My Search</h3>
			<form action="search" class="mt-5">
				<div class = "form-group">
					<input type = "text" name = "querybox" placeholder = "Enter your keyword" class = "form-control">
					
				</div>
				
				<div class = "container text-center">
					<button class = "btn btn-outline-light">Search</button>
				</div>
			
			</form>
		
		</div>	
	</div>
</div>
</body>
</html>