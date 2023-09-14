<%@page import="model.DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex03.jsp</title>
</head>
<body>
	<%--
		DAO dao = new DAO();
		String result = dao.test();
	--%>
	<jsp:useBean id="dao" class="model.DAO"/>
	
	<h1>JDBC</h1>
	<hr>
	
	<!-- <h4>결과 : <%--=result --%></h4> -->
	<h4>결과 : <%=dao.test() %></h4>
</body>
</html>