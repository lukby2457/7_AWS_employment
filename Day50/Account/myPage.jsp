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
	
	<form action="updatePro.jsp" method="POST">
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
				<td><input name="userpw" type="password" required></td>
			</tr>
			<tr>
				<th>Nick</th>
				<td><%=user.getNick() %></td>
			</tr>
			<tr>
				<th>Email</th>
				<td><input name="email" type="email" value="<%=user.getEmail() %>" required></td>
			</tr>
			<tr>
				<th>Join_Date</th>
				<td><%=user.getJoin_date() %></td>
			</tr>
		</table>
		
		<br>
		
		<input name="idx" type="hidden" value="<%=user.getIdx() %>">
		<button>계정 정보 수정</button>
	</form>
			
		<br>
			
		<script src="../js/check.js"></script>
		<button class="delete" onclick="check(<%=user.getIdx() %>)">계정 정보 삭제</button>
		
	
</article>


</body>
</html>