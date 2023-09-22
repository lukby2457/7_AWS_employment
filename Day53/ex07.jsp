<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex07.jsp</title>
</head>
<body>
	<h1>JSTL - attribute</h1>
	<hr>
	
	<%--
		var : Attribute 이름
		value : 저장할 데이터
		scope : 저장할 영역. page가 기본값
	 --%>
	<c:set var="p1" value="홍길동" scope="page"/>
	<c:set var="p2" value="김수진" scope="request"/>
	<c:set var="p3" value="이민지" scope="session"/>
	<c:set var="p4" value="박진호" scope="application"/>
	
	<ul>
		<li>pageContext : ${p1 }</li>
		<li>request : ${p2 }</li>
		<li>session : ${p3 }</li>
		<li>application : ${p4 }</li>
	</ul>
	
	<p><a href="ex07_result.jsp"><button>전환</button></a></p>
	
	<form>
		<input name="forward" type="hidden" value="yes">
		<button>포워드</button>
	</form>
	
	<c:if test="${not empty param.forward }">
		<jsp:forward page="ex07_result.jsp"/>
	</c:if>
	
</body>
</html>