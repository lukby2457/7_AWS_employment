<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<c:set var="login" value="${not empty user ? 'logout' : 'login' }"/>
<c:set var="nick" value="${not empty user ? user.nick : '회원가입' }"/>
<c:set var="accPage" value="${not empty user ? 'mypage/' : 'signUp' }"/>
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
			<li><a href="${cpath }/account/${accPage}">${nick }</a></li>
			<li><a href="${cpath }/account/${login}">${login }</a></li>
		</ul>
	</nav>
	
	<hr>
</header>