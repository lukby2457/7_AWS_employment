<%@page import="dto.AccountVO"%>
<%@page import="java.util.List"%>
<%@page import="model.DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<h4>계정 목록</h4>
	
	<% List<AccountVO> list = dao.selectAll(); %>
	
	<table class="accounts">
		<thead>
			<tr>
				<th>IDX</th>
				<th>ID</th>
				<th>PW</th>
				<th>Nick</th>
				<th>Email</th>
				<th>Join_Date</th>
			</tr>
		</thead>
		<tbody>
			<% for (AccountVO row : list) { %>
			<tr>
				<td><%=row.getIdx() %></td>
				<td><%=row.getUserid() %></td>
				<td><%=row.getUserpw() %></td>
				<td><%=row.getNick() %></td>
				<td><%=row.getEmail() %></td>
				<td><%=row.getJoin_date() %></td>
			</tr>
			<% } %>
		</tbody>
	</table>

</body>
</html>