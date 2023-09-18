<%@page import="dto.AccountVO"%>
<%@page import="model.AccountDAO"%>
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
	
	<jsp:useBean id="user" class="dto.AccountVO"/>
	<jsp:setProperty property="*" name="user"/>
	<%-- userid, userpw만 전달됨 --%>
	
	<%
		AccountDAO dao = new AccountDAO();
		user = dao.selectOne(user);
		
		// user가 null이 아니면 -> 로그인 성공
		
		if(user != null) {
			// 성공시 세션에 저장해서 로그인 상태를 유지 시킨다 -> 홈으로 리다이렉트
			session.setAttribute("user", user);
		}
		
		response.sendRedirect("home.jsp");
	%>
	
</body>
</html>