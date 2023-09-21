<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<%
	String nick = request.getParameter("nick");

	if(nick.equals("x")) {
		response.sendRedirect("login.jsp");
	}
%>

<article>
	<form action="update.jsp" method="POST">
		<table class="list">
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
				<td><input name="userpw" type="password" placeholder="PW" required></td>
			</tr>
			<tr>
				<th>PW확인</th>
				<td><input name="userpw" type="password" placeholder="PW" required></td>
			</tr>
			<tr>
				<th>Nick</th>
				<td><%=user.getNick() %></td>
			</tr>
			<tr>
				<th>Email</th>
				<td><input name="email" type="email" placeholder="Email" required value="<%=user.getEmail() %>"></td>
			</tr>
			<tr>
				<th>Join_Date</th>
				<td><%=user.getJoin_date() %></td>
			</tr>
		</table>
		
		<p class="msg"></p>
		
		<input name="idx" type="hidden" value="<%=user.getIdx() %>">
		<button class="update">계정 정보 수정</button>
		<button type="button" class="delete" onclick="check(<%=user.getIdx() %>)">계정 정보 삭제</button>
	</form>
	
</article>

<script src="../js/pwCheck.js"></script>

</body>
</html>