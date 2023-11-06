<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>success</title>
</head>
<body>
<form>
<h1>${Header}</h1>
<h3>${Desc}</h3>
<h3>${commonmsg }</h3>
<br>
<!--   use this when using first method in contact controller
<h1> Welcome ${name }</h1>
<h1>Your email address is ${email}</h1>
<h1> your password is ${password } try to secure the password</h1>
-->

<!-- use this when using second or third method in contact controller -->
<h1> Welcome ${user.userName }</h1>
<h1>Your email address is ${user.userEmail}</h1>
<h1> your password is ${user.userPassword } try to secure the password</h1>


</form>
</body>
</html>