<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{
 background-color: pink;
}
</style>
</head>
<body>
<c:if test="${u!=null}">

<h1><a href="view Details">edit/update></a></h1>
<h1><a href="Update">edit/update></a></h1>
<h1><a href="Verify">edit/update></a></h1>
<h1><a href="Delete">edit/update></a></h1>




</c:if>
</body>
</html>