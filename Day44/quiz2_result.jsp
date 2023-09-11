<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz2_result.jsp</title>
</head>
<body>
	<%
		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2"));
	%>
	
	<h1>결과</h1>
	<hr>
	
	<ul>
		<li>n1 = <%=n1 %></li>
		<li>n2 = <%=n2 %></li>
		<li>n1 + n2 = <%=n1 + n2 %></li>
	</ul>
	
	<button onclick="history.back()">뒤로</button>
</body>
</html>