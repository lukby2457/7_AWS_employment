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
	%>
	
	<script>
		let row = <%=row %>;
		
		if (row = 0) {
			alert('수정 실패');
			history.back();
		}
		else {
			alert('수정 성공');
			location.href = "logout.jsp";
		}
	</script>

</body>
</html>