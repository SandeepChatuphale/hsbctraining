<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	
	<c:if test="${ user } ">
		<a href="login">Login</a>
		<a href="login">Register</a>
	</c:if>
	<c:if test="${ user } ">
		<h3>Welcome ,  ${ user.username }  </h3>
		<a href="login">Show All Booking</a>
		<a href="logout">Logout</a>
	</c:if>
</body>
</html>