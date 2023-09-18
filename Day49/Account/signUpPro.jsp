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

	<%request.setCharacterEncoding("utf-8"); %>
	
	<jsp:useBean id="sign" class="dto.AccountVO"/>
	<jsp:setProperty property="*" name="sign"/>
	
	<%
		AccountDAO dao = new AccountDAO();
		int row = dao.insert(sign);
	%>
	
	
	<script>
		let row = <%=row %>;
		let msg = '가입';
		
		message(row, msg);
	</script>

</body>
</html>