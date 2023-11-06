<%
String msg = null;
Cookie[] cookies = request.getCookies();
for(int i = 0; i < cookies.length; i++) 
{
	if (cookies[i].getName().equals("a")) 
	{
    cookies[i].setMaxAge(0);
    response.addCookie(cookies[i]);
	msg= "You are logged out successfully...";
	} 
	
	
	if (cookies[i].getName().equals("b")) 
	{
    cookies[i].setMaxAge(0);
    response.addCookie(cookies[i]);
	msg= "Login failed, Please enter correct credentials...";
	} 
	
	if (cookies[i].getName().equals("c")) 
	{
    cookies[i].setMaxAge(0);
    response.addCookie(cookies[i]);
	msg= "You are logged out successfully...";
	} 
	
	
	if (cookies[i].getName().equals("d")) 
	{
    cookies[i].setMaxAge(0);
    response.addCookie(cookies[i]);
	msg= "Login failed, Please enter correct credentials...";
	} 
	
	
}


%>