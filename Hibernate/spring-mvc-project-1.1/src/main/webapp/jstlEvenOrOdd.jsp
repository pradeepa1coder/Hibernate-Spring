<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		int num=55;
	%>
	<c:choose>
		<c:when test="<%=num%2==0 %>">
		<h1><%=num%> is Even no</h1>
		</c:when>
		<c:otherwise>
		<h1><%=num%> is Odd no</h1>
		</c:otherwise>
	</c:choose>
</body>
</html>