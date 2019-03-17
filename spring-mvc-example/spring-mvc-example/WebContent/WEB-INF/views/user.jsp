<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Home Page</title>
</head>
<body>

<!-- 
String password1 = request.getParameter("password1");
String password = request.getParameter("password");
 -->
<h3> 

<c:if test = "${password1==password}">
         <p> <c:out ${userName} }/>  <p>
      </c:if>

<!--  <h3>Hi ${userName} please login with your username and password--> 
Hi ${userName} your password is correct, Welcome
</h3>

</body>
</html>