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
	<%
		String name = request.getParameter("name");
		PersonDAO dao = new PersonDAO();
		
		int row = dao.delete(name);
	%>
	
	<script>
		let row = <%=row %>;
		
		if (row == 0) {
			alert('삭제 실패');
			history.back();
		}
		else {
			alert('삭제 성공');
			location.href = "ex02.jsp";
		}
	</script>
</body>
</html>