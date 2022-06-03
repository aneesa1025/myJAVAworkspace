<html>
<body>
    <form action="login" method="get">
	<h1>Login Here</h1>
	<% 
	  String msg = request.getParameter("msg");
	  if(msg != null){
	%>
	<h3> <%= msg %> </h3>
	<% }%>
	<label>Username: </label> <input type="text" name="username" /> <br/>
	<label>Password :</label> <input type="password" name="password" /> </br/>
	<input type="submit" name="login" value="Login" />
	
	</form>
	
</body>
</html>