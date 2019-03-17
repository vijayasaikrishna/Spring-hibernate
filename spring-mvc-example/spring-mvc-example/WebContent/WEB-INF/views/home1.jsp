<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>
	<h2>Please enter your password twice for confirmation</h2>
	<P>The time on the server is ${serverTime1}.</p>
 
	<form action="User1" method="post">
		<td>Username  : 				</td>
		<input type="text" name="userName"><br> 
		<td>Password     : 				</td>
		<input type="password" name="password1" > <br> 
		<td>Re-Enter Password  :		</td>
		<input type ="password" name ="password" ><br>
		<input	type="submit" value="login">
	</form>
	
	<!-- Your user name and password will be stored in database -->
</body>
</html>



