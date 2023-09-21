<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<% request.setCharacterEncoding("utf-8"); %>

	<jsp:useBean id="input" class="beans.AccountVO"/>
	<jsp:setProperty property="*" name="input"/>
	
	<%
		int row = dao.insert(input);
		
		String msg = "가입 ";
		msg += (row == 0) ? "실패" : "성공";
	%>
	
	<script>
		message('<%=msg %>', <%=row %>);
	</script>

</body>
</html>