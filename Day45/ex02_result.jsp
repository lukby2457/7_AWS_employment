<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex02_result.jsp</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		
		String encoding = request.getCharacterEncoding();
		String method = request.getMethod();
	
		String name = request.getParameter("name");
		String email = request.getParameter("email");
	%>
	
	<h1>결과</h1>
	<hr>
	
	<ul>
		<li><%=encoding %></li>
		<li><%=method %></li>
		<li><%=name %></li>
		<li><%=email %></li>
	</ul>
	
</body>
</html>