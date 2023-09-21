<%@page import="java.util.ArrayList"%>
<%@page import="beans.AccountVO"%>
<%@page import="java.util.List"%>
<%@page import="model.AccountDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<jsp:useBean id="find" class="beans.AccountVO"/>
	<jsp:setProperty property="*" name="find"/>
	
	<%
		List<AccountVO> list = dao.findID(find);
		
		List<String> userid = new ArrayList<String>();
		
		String msg = "";
		
		if(list.size() != 0) {
			for(AccountVO row : list) {
				msg = row.getUserid() + "입니다";
				userid.add(msg);
			}
		}
		else {
			msg = "존재하지 않습니다";
			userid.add(msg);
		}
	%>
	
	<article>
		<% for(String id : userid) { %>
		
		<h4>당신의 ID는 <%=id %></h4>
		
		<% } %>
		
		<a href="login.jsp">
			<button type="button">login</button>
		</a>
	</article>

</body>
</html>