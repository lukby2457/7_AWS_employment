<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex11.jsp</title>
</head>
<body>
	<h1>JSTL - 반복문</h1>
	<hr>
	
	<%--
		var : 반복하는 값을 저장하는 Attribute 이름. pageContext에 저장
		begin : 반복의 시작 값
		end : 반복의 끝 값
		step : 증감. 기본값 1. 음수 지정시 에러
	 --%>
	<c:forEach var="i" begin="1" end="5" step="2">
		<p>${i } : Hello World!!!</p>
	</c:forEach>
	
	<h4>거꾸로!</h4>
	
	<c:forEach var="i" begin="1" end="5" step="2">
		<p>${6 - i } : Hello JSTL!!!</p>
	</c:forEach>
	
	<h4>연습</h4>
	
	<select>
		<c:forEach var="i" begin="1900" end="2023">
			<option>${3923 - i }</option>
		</c:forEach>
	</select>
	
</body>
</html>