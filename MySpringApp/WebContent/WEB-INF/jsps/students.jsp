<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>All Students</h1>
<%
	String sname = (String)request.getAttribute("sname");
%>
<%=sname %>

<h3>List Iteration</h3>
<%
	List<String> list = (List<String>) request.getAttribute("slist");
	 for(String s : list){
		 out.print(s + " *** ");
	 }
%>
</body>
</html>