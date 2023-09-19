<%@page import="beans.PersonVO"%>
<%@page import="java.util.List"%>
<%@page import="model.PersonDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz.jsp</title>
<link rel="stylesheet" href="css/style2.css">
</head>
<body>
	<%
		PersonDAO dao = new PersonDAO();
		List<PersonVO> list = dao.selectAll();
	%>

	<h1>Quiz1</h1>
	<hr>
	
	<h4>PersonDAO를 작성하여 아래 테이블을 모두 출력</h4>
	
	<table>
		<thead>
			<tr>
				<th>이름</th>
				<th>신장</th>
				<th>생년월일</th>
			</tr>
		</thead>
		<tbody>
			<% for (PersonVO row : list) { %>
			<tr>
				<td><%=row.getName() %></td>
				<td><%=row.getHeight() %></td>
				<td><%=row.getBirth() %></td>
			</tr>
			<% } %>
		</tbody>
	</table>
</body>
</html>