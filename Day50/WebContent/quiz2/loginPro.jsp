<%@page import="beans.AccountVO"%>
<%@page import="model.AccountDAO"%>
<%@page import="model.PersonDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% request.setCharacterEncoding("utf-8"); %>
	
	<jsp:useBean id="user" class="beans.AccountVO"/>
	<jsp:setProperty property="*" name="user"/>
	
	<%
		AccountDAO dao = new AccountDAO();
		user = dao.selectOne(user);
		
		if(user != null) {
			session.setAttribute("user", user);
		}
		
		response.sendRedirect("home.jsp");
	%>

</body>
</html>