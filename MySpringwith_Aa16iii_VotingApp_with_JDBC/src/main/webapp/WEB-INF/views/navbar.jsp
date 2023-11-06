<!--  
<center>
<br>

<a href = "${pageContext.request.contextPath}">Home</a>&ensp;
<a href ="${pageContext.request.contextPath}/registration">Registration</a>&ensp;
<a href ="${pageContext.request.contextPath}/login">login</a>&ensp;
<a href ="${pageContext.request.contextPath}/adminlogin">Admin Login</a>
<br>
</center>
-->
    

<div class="topnav" id="myTopnav">
  <a href="${pageContext.request.contextPath}" class="active">Home</a>
  <a href="${pageContext.request.contextPath}/registration">Registration</a>
  <a href="${pageContext.request.contextPath}/login">Voter Login</a>
  <a href="${pageContext.request.contextPath}/adminlogin">Admin Login</a>
  <a href="javascript:void(0);" class="icon" onclick="myFunction()">
    <i class="fa fa-bars"></i>
  </a>
</div>



<script>
function myFunction() {
  var x = document.getElementById("myTopnav");
  if (x.className === "topnav") {
    x.className += " responsive";
  } else {
    x.className = "topnav";
  }
}
</script>
