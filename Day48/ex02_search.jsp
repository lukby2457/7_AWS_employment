<%@page import="java.util.List"%>
<%@page import="dto.PersonVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
	
	<h4>검색 결과</h4>
	
	<jsp:useBean id="dao" class="model.PersonDAO"/>
	<% String name = request.getParameter("name"); %>
	<% List<PersonVO> list = dao.selectOne(name); %>
	
	<table>
		<thead>
			<tr>
				<th>이름</th>
				<th>신장</th>
				<th>생년월일</th>
			</tr>
		</thead>
		<tbody>
			<% for(PersonVO row : list) { %>
				<tr>
					<td><%=row.getName() %></td>
					<td><%=row.getHeight() %></td>
					<td><%=row.getBirth() %></td>
				</tr>
			<% } %>
		</tbody>
	</table>
	
	<br>
	
	<button onclick="history.back()">뒤로</button>
</body>
</html>