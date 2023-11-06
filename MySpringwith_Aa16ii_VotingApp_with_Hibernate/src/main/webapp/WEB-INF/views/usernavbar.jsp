<!--  
<center>

<br>
<a href = "${pageContext.request.contextPath}/dovotes">User Home</a>&ensp;
<a href ="${pageContext.request.contextPath}/login">User Logout</a>
<br>
</center>
-->


<div class="topnav" id="myTopnav">
  <a href="${pageContext.request.contextPath}/dovotes" class="active">Voter Home</a>
  <a href="${pageContext.request.contextPath}/login">Voter Logout</a>
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
