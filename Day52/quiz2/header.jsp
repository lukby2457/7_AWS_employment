<%@page import="beans.AccountVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Day50/Account</title>
<link rel="stylesheet" href="../css/style3.css">
</head>
<body>
	<jsp:useBean id="dao" class="model.AccountDAO"/>
	
	<%
		AccountVO user = (AccountVO) session.getAttribute("user");
		String login = "logout";
		
		if (user == null) {
			user = new AccountVO();
			user.setNick("x");
			
			login = "login";
		}
	%>

	<h1>DBCP</h1>
	
	<nav>
		<ul class="menu">
			<li><a href="home.jsp">home</a></li>
			<li><a href="<%=login %>.jsp"><%=login %></a></li>
			<li><a href="signUp.jsp">signUp</a></li>
		</ul>
		
		<div>
			<h4>로그인 : <a href="myPage.jsp?nick=<%=user.getNick() %>"><%=user.getNick() %></a></h4>
		</div>
	</nav>
	
	<hr>
