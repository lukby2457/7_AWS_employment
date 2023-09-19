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
	<form action="update.jsp">
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
		
		<input name="idx" type="hidden" value="<%=user.getIdx() %>">
		<button class="update">계정 정보 수정</button>
	</form>
	
	<button class="delete" onclick="check(<%=user.getIdx() %>)">계정 정보 삭제</button>
</article>

<script>
	function check(idx) {
		let ok = confirm('삭제 하시겠습니까?');
		
		if(ok) {
			location.href = 'delete.jsp?idx=' + idx;
		}
	}
</script>

</body>
</html>