<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex10.jsp</title>
</head>
<body>
	<h1>JSTL - 조건</h1>
	<hr>
	
	<form>
		<p><input name="age" type="number" placeholder="나이" required value="${param.age }"></p>
		<button>전송</button>
	</form>
	
	<c:if test="${not empty param.age }">
		<h4>결과</h4>
		
		<%-- choose : 조건을 범위로 묶는 태그 --%>
		<c:choose>
			<c:when test="${param.age >= 19 }">	<%-- if --%>
				<p>성인 입니다</p>
			</c:when>
			<c:when test="${param.age >= 16 }">	<%-- else if --%>
				<p>고등학생 입니다</p>
			</c:when>
			<c:when test="${param.age >= 13 }">
				<p>중학생 입니다</p>
			</c:when>
			<c:otherwise>						<%-- else --%>
				<p>초등학생 이하 입니다</p>
			</c:otherwise>
		</c:choose>
	</c:if>
</body>
</html>