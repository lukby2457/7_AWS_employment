<%@page import="beans.AccountVO"%>
<%@page import="model.AccountDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ITBANK</title>

<link rel="stylesheet" href="../css/style.css">
<script src="../js/message.js"></script>
</head>
<body>
	<%--
		Day49에 있는 Account의 기능을 모두 다시 구현
		단, DBCP를 사용한다
	 --%>
	
	<%
		AccountDAO dao = new AccountDAO();
		AccountVO user = (AccountVO) session.getAttribute("user");
		String login = "logout";
		
		if (user == null) {
			user = new AccountVO();
			user.setNick("x");
			
			login = "login"; 
		}
	%>
	 
	<h1>Quiz</h1>
	
	<nav>
		<ul class="menu">
			<li><a href="home.jsp">home</a></li>
			<li><a href="<%=login %>.jsp"><%=login %></a></li>
			<li><a href="signUp.jsp">signUp</a></li>
			<li><a href="myPage.jsp">myPage</a></li>
		</ul>
		
		<h4>접속 : <%=user.getNick() %></h4>
	</nav>
	
	<hr>

</body>
</html>