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

	<P>The time on the server is ${serverTime1}.</p>

	<form action="User" method="post">
		<td>Username: </td>
		<input type="text" name="userName" ><br> 
		<td>Password:  </td>
		<input type ="password" name ="password" ><br>
		<input	type="submit" value="login">
	</form>
</body>
</html>



