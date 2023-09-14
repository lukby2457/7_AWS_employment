<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<%
		if ((login.getNick()).equals("x")) {
			response.sendRedirect("home.jsp");
		}
	%>

	<table>
  		<tr>
  			<th>ID</th>
  			<td><%=login.getUserid() %></td>
  		</tr>
  		<tr>
  			<th>PW</th>
  			<td><%=login.getUserpw() %></td>
  		</tr>
  		<tr>
  			<th>Nick</th>
  			<td><%=login.getNick() %></td>
  		</tr>
	</table>

</body>
</html>