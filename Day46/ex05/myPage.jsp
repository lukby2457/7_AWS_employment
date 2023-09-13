<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<%@ include file="style.css" %>

	<%
		if ((user.getNick()).equals("x")) {
			response.sendRedirect("home.jsp");
		}
	%>

	<table>
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
	</table>

</body>
</html>