<%@page import="model.AccountDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<article>
	<% 
		String nick = request.getParameter("nick"); 
		
		if(nick.equals("x")) {
			response.sendRedirect("login.jsp");
		}
	%>
	
	<table class="myPage">
		<tr>
			<th>IDX</th>
			<td><%=user.getIdx() %></td>
		</tr>
		<tr>
			<th>ID</th>
			<td><%=user.getUserid() %></td>
		</tr>
		<tr>
			<th>PW</th>
			<td><%=user.getUserpw() %></td>
		</tr>
		<tr>
			<th>Nick</th>
			<td><%=user.getNick() %></td>
		</tr>
		<tr>
			<th>Email</th>
			<td><%=user.getEmail() %></td>
		</tr>
		<tr>
			<th>Join_Date</th>
			<td><%=user.getJoin_date() %></td>
		</tr>
	</table>
	
	<div>
		<a href="update.jsp">계정 정보 수정</a>
		<a href="delete.jsp?idx=<%=user.getIdx() %>">계정 정보 탈퇴</a>
	</div>
</article>

</body>
</html>