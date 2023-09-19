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
	
	<jsp:useBean id="data" class="dto.AccountVO"/>
	<jsp:setProperty property="*" name="data"/>
	
	<%
		AccountDAO dao = new AccountDAO();
		int row = dao.update(data);
		
		session.removeAttribute("user");
	%>
	
	<script src="../js/message.js"></script>
	<script>
		let row = <%=row %>;
		let msg = '수정';
		
		message(row, msg);
	</script>

</body>
</html>