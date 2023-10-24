<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>view</title>
</head>
<body>
	<h1>view</h1>
	<hr>
	
	<ul>
		<li>번호 : ${view.idx }</li>
		<li>제목 : ${view.title }</li>
		<li>저자 : ${view.writer }</li>
		<li>출판사 : ${view.publisher }</li>
		<li>출판일 : ${view.p_date }</li>
		<li>가격 : ${view.price }</li>
	</ul>
	
	<a href="${cpath }/book/list"><button>홈</button></a>
	
</body>
</html>