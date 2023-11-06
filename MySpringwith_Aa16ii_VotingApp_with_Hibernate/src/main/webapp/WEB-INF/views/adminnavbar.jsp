<!--  
<center>
<br>
<a href = "${pageContext.request.contextPath}/adminhome">Admin Home</a>&ensp;
<a href = "${pageContext.request.contextPath}/viewadmins">Admin Details</a>&ensp;
<a href ="${pageContext.request.contextPath}/viewusers">All User details</a>&ensp;
<a href ="${pageContext.request.contextPath}/viewcandidates">Candidates votes Details</a>
<a href ="${pageContext.request.contextPath}/adminlogin">Admin Logout</a>
<br>
</center>
-->


<div class="topnav" id="myTopnav">
  <a href="${pageContext.request.contextPath}/adminhome" class="active">Admin Home</a>
  <a href="${pageContext.request.contextPath}/viewadmins">Admin Details</a>
  <a href="${pageContext.request.contextPath}/viewusers">User Details</a>
  <a href="${pageContext.request.contextPath}/viewcandidates">Candidates Votes Details</a>
  <a href="${pageContext.request.contextPath}/adminlogin">Admin Logout</a>
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
			