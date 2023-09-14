<%@page import="beans.Account"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.menu {
		list-style: none;
		padding: 0;
		display: flex;
	}
	.menu > li {
		margin: 0 10px;
	}
	a {
		color: black;
		text-decoration: none;
	}
	a:hover {
		text-decoration: underline;
	}
	form > p {
		display: flex;
		width: 210px;
		justify-content: space-between;
	}
	table{
		border-collapse: collapse;
		margin: 10px 0;
	}
	th, td{
		border: 1px solid black;
	    padding: 5px 10px;
	}
</style>
</head>
<body>
	<%
		Account login = (Account)session.getAttribute("login");
	
		if(login == null) {
			login = new Account();
		}
	%>
	
	<h1>Quiz</h1>

	<ul class="menu">
		<li><a href="home.jsp">home</a></li>
		<li><a href="myPage.jsp">myPage</a></li>
		<li><a href="logout.jsp">logout</a></li>
	</ul>
	
	<hr>

