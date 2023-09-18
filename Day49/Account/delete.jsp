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

	<% 
		int idx = Integer.parseInt(request.getParameter("idx")); 
	
		AccountDAO dao = new AccountDAO();
		int row = dao.delete(idx);
	%>
	
	<script>
		let row = <%=row %>
		
		if(row = 0) {
			alert('삭제 실패');
			history.back();
		}
		else {
			alert('삭제 성공');
			location.href = "logout.jsp";
		}
	</script>

</body>
</html>