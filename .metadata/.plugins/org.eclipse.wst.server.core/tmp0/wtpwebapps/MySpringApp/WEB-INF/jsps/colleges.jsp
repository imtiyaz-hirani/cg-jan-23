<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>All Colleges</h1>
<%
	String cname = (String)request.getAttribute("collegeName");
%>
<%=cname %>
<h3>Array Iteration</h3>
<%
	String[] sarry = (String[])request.getAttribute("sarry");
	for(String s : sarry){
		out.print(s + "<BR>");
	}
%>

</body>
</html>