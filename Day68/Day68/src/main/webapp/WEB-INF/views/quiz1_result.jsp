<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz1_result.jsp</title>
</head>
<body>
	<h1>결과</h1>
	<hr>
	
	<c:forEach var="i" items="${lotto }">
		<p>${i }</p>
	</c:forEach>

</body>
</html>