<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<c:set var="user" value="${user }"/>
<c:set var="nick" value="${not empty user ? user.nick : 'x'}"/>
<c:set var="login" value="${not empty user ? 'login' : 'login'}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ITBANK</title>
<link rel="stylesheet" href="${cpath }/css/style.css">
</head>
<body>
<header>
	<h1>ITBANK</h1>
	
	<ul class="menu">
		<li><a href="${cpath }/home">home</a></li>
		<li><a href="${cpath }/login">login</a></li>
		<li><a href="#">signUp</a></li>
		<li>${date }</li>
		<li>로그인 : ${nick }</li>
		<li><button onclick="logout()">logout</button></li>
	</ul>
	
	<hr>
</header>

<script>
	function logout() {
		let url = 'login';
		
		fetch(url, { method : 'delete'})
		.then(response => {
			console.log(response);
		})
		
		location.href='home';
	}
</script>