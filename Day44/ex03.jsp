<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex03.jsp</title>
</head>
<body>
	<h1>지시자</h1>
	<hr>
	
	<%@page import="java.util.Date"%>
	<%@page import="java.text.SimpleDateFormat"%>

	<%
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a HH:mm:ss E요일");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 a hh:mm:ss E요일");
		
		String time = sdf.format(date);
		String time2 = sdf2.format(date);
	%>
	
	<ul>
		<li>date = <%=date %></li>
		<li>time = <%=time %></li>
		<li>time2 = <%=time2 %></li>
	</ul>
	
</body>
</html>