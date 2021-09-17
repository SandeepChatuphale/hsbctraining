<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	
	<jsp:include page="header.jsp"/>
	<span style="color: red;">${ error }</span> 
	<form action="/ticketbooking/user" method="POST">
		<input type="text" name="username" value="${ username }"><br/>
		<input type="password" name="password"><br/>
		<input type="submit" value="Login">
	</form>
</body>
</html>