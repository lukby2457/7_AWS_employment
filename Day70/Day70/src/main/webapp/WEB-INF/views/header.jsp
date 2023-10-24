<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${cpath }</title>
<link rel="stylesheet" href="${cpath }/resources/css/style.css">
</head>
<body>
	<h1>${cpath } - Mybatis</h1>
	
	<ul class="menu">
		<li><a href="${cpath }">home</a></li>
		<li><a href="${cpath }/book/add">add</a></li>
	</ul>
	
	<hr>
