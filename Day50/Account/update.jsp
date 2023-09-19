<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<article>
	<form action="updatePro.jsp">
		<p><%=user.getUserid() %></p>
		<p><input name="userpw" type="password" placeholder="PW" required value="<%=user.getUserpw() %>"></p>
		<p><input name="nick" placeholder="Nick" required value="<%=user.getNick() %>"></p>
		<p><input name="email" type="email" placeholder="Email" required value="<%=user.getEmail() %>"></p>
		<input name="idx" type="hidden" value="<%=user.getIdx() %>">
		
		<button>전송</button>
	</form>
</article>

</body>
</html>