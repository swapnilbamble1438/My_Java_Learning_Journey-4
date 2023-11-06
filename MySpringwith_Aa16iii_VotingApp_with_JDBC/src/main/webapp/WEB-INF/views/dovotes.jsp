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
<link rel="stylesheet" href="resources/css/bootstrap.css">
</head>
<body style="background-color: #f6f5f3">
<%@ include file = "usernavbar.jsp" %>
<center>

<form action = "processvote" method="post">
<div class="container" id="cb" style="background-color: white">

<div class = "row">
		<div class = "col-lg-6 col-md-6 col-sm-6 col-xs-12">


<!--  -->

		<table>
						<h3>Voter Details:</h3>
							<img src="<c:url value="resources/image/voter.jpg"/>" height="125px" alt="Voter Icon">
							
					</table>
						
						<table border = '1' cellspacing=5 cellpadding=5 align='center'>
							
							<tr>
								<th>Id: </th>
							<th> ${user.id }</th>
							</tr>
							
							<tr>
								<th>Name: </th>
								<th> ${user.name }</th>
							</tr>
							
							
						
								<tr>
									<th>Email Id: </th>
									<th>${user.email } </th>
								</tr>
					
								<tr>
									<th>Phone No.: </th>
									<th>${user.phoneno } </th>
								</tr>

								<tr>
									<th>Status: </th>
									<th>${status} </th>
								</tr>
				
						</table>




<!--  -->


</div>
	
	<div class = "col-lg-6 col-md-6 col-sm-6 col-xs-12">
	



<!--  -->

<%String msg = request.getParameter("msg"); 
if(msg != null)
{%>
<h1 style="color: red"><%=msg %></h1>
<%} %>
<b>	${name }	do vote if not voted yet</b><br>
<input value ="${name }" name = "name" type="hidden" >
	
 <br>
 <input type="radio" name="candidate"  value ="candidate1" required >&ensp;<b>Candidate 1  </b><br><br>
  <input type="radio" name="candidate"  value = "candidate2" required >&ensp;<b>Candidate 2 </b><br><br>
  <input type="radio" name="candidate"  value = "candidate3" required >&ensp;<b>Candidate 3 </b><br><br>
  <input type="radio" name="candidate"  value = "candidate4" required >&ensp;<b>Candidate 4 </b><br><br>
    
    <br>
</select> 
   
<input type = "submit" value="Vote">

<!--  -->

</div>
</div>



</div>
</form>
</center>
</body>
</html>