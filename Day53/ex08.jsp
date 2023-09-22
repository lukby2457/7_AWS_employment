<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex08.jsp</title>
</head>
<body>
	<h1>JSTL - 조건</h1>
	<hr>
	
	<%-- if : test에 true가 들어가면 실행. 그 외 모든 값은 실행x --%>
	<c:if test="${10 > 5 }">
		<p>실행이 되나요?</p>
	</c:if>
	
	<h4>아래 구문을 잘 생각해 보세요~</h4>
	<p>10 > 5, ${10 > 5 }</p>
</body>
</html>