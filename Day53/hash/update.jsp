<%@page import="service.NewPw"%>
<%@page import="model.AccountDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="../js/message.js"></script>
</head>
<body>
	<% request.setCharacterEncoding("utf-8"); %>
	
	<jsp:useBean id="input" class="beans.AccountVO"/>
	<jsp:setProperty property="*" name="input"/>
	
	<%
		String pw = input.getUserpw();
		String hash = NewPw.getHash(pw);
		input.setUserpw(hash);
	
		AccountDAO dao = new AccountDAO();
		int row = dao.update(input);
		
		session.removeAttribute("user");
	%>
	
	<script>
		let row = <%=row %>;
		let msg = "수정";
		
		message(row, msg);
	</script>
</body>
</html>