<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MyApp- Dashboard</title>
</head>
<body>
<h1>Dashboard</h1>

<div> 
	<a href="${pageContext.request.contextPath}/employees">Employees</a> <br />
	<a href="${pageContext.request.contextPath}/colleges">Colleges</a> <br />
	<a href="${pageContext.request.contextPath}/students">Students</a> <br />
</div>
</body>
</html>
<!--  
	EL : Expression Language
	SPEL: Spring Expression Language
 -->