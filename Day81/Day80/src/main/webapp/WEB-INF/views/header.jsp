<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${cpath }/resources/css/style.css">
</head>
<body>
	<h1>${cpath } - Transaction</h1>
	
	<c:set var="login" value="${not empty user ? 'logout' : 'login' }"/>
	<c:set var="sign" value="${not empty user ? 'mypage' : 'signup' }"/>
	<c:set var="nick" value="${not empty user ? user.nick : 'signUp' }"/>
	
	<ul class="menu">
		<li><a href="${cpath }/">home</a></li>
		<li><a href="${cpath }/account/${login }">${login }</a></li>
		<li><a href="${cpath }/account/${sign}">${nick }</a></li>
	</ul>
	
	<hr>