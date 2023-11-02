<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${cpath }</title>
<link rel="stylesheet" href="${cpath }/resources/css/style.css">
</head>
<body>
<header>
	<h1>${cpath }/Account</h1>
	
	<nav class="menu">
		<ul>
			<li><a href="${cpath }/">home</a></li>
			<li><a href="#">board</a></li>
		</ul>
		
		<ul>
			<li class="debug"><a href="${cpath }/account/list">debug</a></li>
			
			<c:if test="${empty user }">
				<li><a href="${cpath }/account/signup">회원가입</a></li>
				<li><a href="${cpath }/account/login">로그인</a></li>
			</c:if>
			
			<c:if test="${not empty user }">
				<li><a href="${cpath }/account/mypage?idx=${user.idx }">${user.nick }</a></li>
				<li><a href="${cpath }/account/logout">로그아웃</a></li>
			</c:if>
		</ul>
	</nav>
	
	<hr>
</header>