<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <!--//this library line is Vimp,get from sir github  --> 
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="u" items="${us }">
<h2>${u.getId() } ${u.getName() } ${u.getPhone() }</h2>
</c:forEach>
</body>
</html>