<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Account</title>
<script src="../js/message.js"></script>
<style>
	a {
		color: inherit;
		text-decoration: none;
	}
	a:hover {
		text-decoration: underline;
	}
	.menu {
		list-style: none;
		padding: 0;
		display: flex;
	}
	.menu > li {
		margin: 0 10px;
	}
	.accounts {
		border-collapse: collapse;
	}
	.accounts th, .accounts td {
		border: 1px solid black;
		padding: 5px 10px;
	}
	.accFind {
		display: flex;
	}
</style>
</head>
<body>
	<jsp:useBean id="dao" class="model.AccountDAO"/>
	
	<c:choose>
		<c:when test="${not empty user }">
			<c:set var="nick" value="${user.nick }"/>
			<c:set var="login" value="logout"/>
		</c:when>
		<c:otherwise>
			<c:set var="nick" value="x"/>
			<c:set var="login" value="login"/>
		</c:otherwise>
	</c:choose>

	<h1>Account</h1>
	
	<ul class="menu">
		<li><a href="home.jsp">home</a></li>
		<li><a href="${login }.jsp">${login }</a></li>
		<li><a href="signUp.jsp">signUp</a></li>
		<li><a href="myPage.jsp">myPage</a></li>
		<li>접속 : ${nick }님</li>
	</ul>
	
	
	<hr>

