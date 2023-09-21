<%@page import="beans.AccountVO"%>
<%@page import="java.util.List"%>
<%@page import="model.AccountDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<%
	List<AccountVO> list = dao.selectAll();
%>

	<%--
		Day49에 있는 Account의 기능을 모두 다시 구현
		단, DBCP를 사용한다
	 --%>
	 
<article>
	<h4>계정 정보</h4>
	
	<table class="list">
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
			<% for(AccountVO row : list) { %>
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
</article>
</body>
</html>