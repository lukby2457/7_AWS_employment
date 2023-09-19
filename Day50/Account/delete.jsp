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
	<jsp:useBean id="idx" class="dto.AccountVO"/>
	<jsp:setProperty property="*" name="idx"/>

	<% 
		// int idx = Integer.parseInt(request.getParameter("idx")); 
	
		AccountDAO dao = new AccountDAO();
		int row = dao.delete(idx.getIdx());
		
		session.removeAttribute("user");
	%>
	
	<script>
		let row = <%=row %>;
		let msg = '삭제';
		
		message(row, msg);
	</script>

</body>
</html>